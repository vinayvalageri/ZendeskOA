package com.zendesk.vinay.service;

import com.zendesk.vinay.model.Ticket;
import com.zendesk.vinay.model.TicketDetailResponse;
import com.zendesk.vinay.model.TicketListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@Service
public class TicketService {

    @Autowired
    private WebClient webClient;

    @Cacheable(value="ticketListCache", key="#offset + #limit")
    public Map<String, Object> getTickets(String offset, String limit) {
        int off = Integer.parseInt(offset);
        int lim = Integer.parseInt(limit);
        int page = (off / lim) + 1;
        TicketListResponse apiResponse = webClient.get()
                .uri("api/v2/tickets.json?page=" + page + "&per_page=" + limit)
                .retrieve()
                .bodyToFlux(TicketListResponse.class)
                .blockFirst();
        Map<String, Object> response = new HashMap<>();
        response.put("total", apiResponse.getCount());
        response.put("rows", apiResponse.getTickets());
        return response;
    }

    @Cacheable(value = "ticketCache", key="#ticketId")
    public Ticket getTicket(String ticketId) {
        return webClient.get()
                .uri("api/v2/tickets/" + ticketId + ".json")
                .retrieve()
                .bodyToFlux(TicketDetailResponse.class)
                .blockFirst().getTicket();
    }

}
