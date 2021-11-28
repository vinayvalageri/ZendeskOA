package com.zendesk.vinay.rest;

import com.zendesk.vinay.model.Ticket;
import com.zendesk.vinay.service.TicketService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TicketControllerTest {
    @InjectMocks
    private TicketController ticketController;

    @Mock
    private TicketService ticketService;

    @Test
    public void testGetTicketList() {
        Ticket ticket = getTicket();
        Map<String, Object> mockResponse = new HashMap<>();
        mockResponse.put("total", 1);

        mockResponse.put("rows", Arrays.asList(ticket));
        when(ticketService.getTickets("0", "1")).thenReturn(mockResponse);
        Map<String, Object> apiResponse = ticketController.tickets("0", "1");
        Assertions.assertEquals(1, apiResponse.get("total"));
        Assertions.assertEquals(1, ((List<Ticket>) apiResponse.get("rows")).size());
        Assertions.assertEquals(ticket, ((List<Ticket>) apiResponse.get("rows")).get(0));
    }

    @Test
    public void testGetTicket() {
        Ticket ticket = getTicket();
        when(ticketService.getTicket("26")).thenReturn(ticket);
        Ticket response = ticketController.ticket("26");
        Assertions.assertEquals(ticket, response);
    }

    private Ticket getTicket() {
        Ticket ticket = new Ticket();
        ticket.setId(26L);
        ticket.setUrl("https://usc123.zendesk.com/api/v2/tickets/26.json");
        return ticket;
    }

}
