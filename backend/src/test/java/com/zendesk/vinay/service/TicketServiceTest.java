package com.zendesk.vinay.service;


import com.zendesk.vinay.model.Ticket;
import com.zendesk.vinay.model.TicketDetailResponse;
import com.zendesk.vinay.model.TicketListResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TicketServiceTest {
    @InjectMocks
    private TicketService ticketService;

    @Mock
    private WebClient webClientMock;
    @Mock
    private WebClient.RequestHeadersSpec requestHeadersMock;
    @Mock
    private WebClient.RequestHeadersUriSpec requestHeadersUriMock;
    @Mock
    private WebClient.RequestBodySpec requestBodyMock;
    @Mock
    private WebClient.RequestBodyUriSpec requestBodyUriMock;
    @Mock
    private WebClient.ResponseSpec responseMock;

    @Test
    public void testGetTicketList() {
        Ticket ticket = getTicket();
        TicketListResponse apiResponse = new TicketListResponse();
        apiResponse.setTickets(Arrays.asList(ticket));
        apiResponse.setCount(1);
        when(webClientMock.get()).thenReturn(requestHeadersUriMock);
        when(webClientMock.get()).thenReturn(requestHeadersUriMock);
        when(requestHeadersUriMock.uri("api/v2/tickets.json?page=1&per_page=1")).thenReturn(requestHeadersMock);
        when(requestHeadersMock.retrieve()).thenReturn(responseMock);
        when(responseMock.bodyToFlux(TicketListResponse.class)).thenReturn(Flux.just(apiResponse));
        Map<String, Object> response = ticketService.getTickets("0", "1");
        Assertions.assertEquals(1L, (Long) response.get("total"));
        Assertions.assertEquals(1, ((List<Ticket>) response.get("rows")).size());
        Assertions.assertEquals(ticket, ((List<Ticket>) response.get("rows")).get(0));
    }

    @Test
    public void testGetTicket() {
        Ticket ticket = getTicket();
        TicketDetailResponse apiResponse = new TicketDetailResponse();
        apiResponse.setTicket(ticket);
        when(webClientMock.get()).thenReturn(requestHeadersUriMock);
        when(webClientMock.get()).thenReturn(requestHeadersUriMock);
        when(requestHeadersUriMock.uri("api/v2/tickets/26.json")).thenReturn(requestHeadersMock);
        when(requestHeadersMock.retrieve()).thenReturn(responseMock);
        when(responseMock.bodyToFlux(TicketDetailResponse.class)).thenReturn(Flux.just(apiResponse));
        Ticket response = ticketService.getTicket("26");
        Assertions.assertEquals(ticket, response);
    }

    private Ticket getTicket() {
        Ticket ticket = new Ticket();
        ticket.setId(26L);
        ticket.setUrl("https://usc123.zendesk.com/api/v2/tickets/26.json");
        return ticket;
    }
}
