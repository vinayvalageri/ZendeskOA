package com.zendesk.vinay.rest;

import com.zendesk.vinay.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

/**
 * Controller fpr getting ticket list and details
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    /**
     * End point for getting list of ticket
     * @param offset Starting index of records
     * @param limit Page limit
     * @return Map containing ticket list and total ticket count
     */
    @GetMapping("/tickets")
    @CrossOrigin(origins = "*")
    public Map<String, Object> tickets(@RequestParam String offset, @RequestParam String limit) {
        return ticketService.getTickets(offset, limit);
    }

    /**
     * Endpoint for getting details of single ticket
     * @param ticketId
     * @return Ticket
     */
    @GetMapping("/ticket")
    @CrossOrigin(origins = "*")
    public com.zendesk.vinay.model.Ticket ticket(@RequestParam String ticketId) {
        return ticketService.getTicket(ticketId);
    }
}
