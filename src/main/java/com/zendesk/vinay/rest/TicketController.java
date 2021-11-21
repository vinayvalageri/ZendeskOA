package com.zendesk.vinay.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Ticket;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class TicketController {
    @Autowired
    private Zendesk zendesk;

    @GetMapping("/tickets")
    public List<Ticket> getTickets() {
        return StreamSupport.stream(zendesk.getTickets().spliterator(), false).collect(Collectors.toList());
    }
}
