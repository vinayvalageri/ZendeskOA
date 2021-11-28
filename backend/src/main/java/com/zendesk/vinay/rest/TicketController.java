package com.zendesk.vinay.rest;

import com.zendesk.vinay.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
//import org.zendesk.client.v2.Zendesk;

import java.util.Map;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private WebClient webClient;


    @GetMapping("/tickets")
    @CrossOrigin(origins = "*")
    public Map<String, Object> tickets(@RequestParam String offset, @RequestParam String limit) {
        return ticketService.getTickets(offset, limit);
    }

    @GetMapping("/ticket")
    @CrossOrigin(origins = "*")
    public com.zendesk.vinay.model.Ticket ticket(@RequestParam String ticketId) {
        return ticketService.getTicket(ticketId);
    }


   /* @GetMapping("/ticks")
    @CrossOrigin(origins = "*")
    public Map<String, Object> tickets(@RequestParam String offset, @RequestParam String limit) {
        List<Ticket> tickets = StreamSupport.stream(zendesk.getTickets().spliterator(), false).collect(Collectors.toList());
        int off = Integer.valueOf(offset);
        int lim = Integer.valueOf(limit);
        System.out.println(off);
        System.out.println(lim);
        Map<String, Object> response = new HashMap<>();
        response.put("total", 55);
        response.put("rows", tickets.subList(off, off+lim));
        return response;
        //return tickets.subList((off*lim), (off*lim)+lim);
    }

    @GetMapping("/tick")
    @CrossOrigin(origins = "*")
    public Ticket tickets() {
        List<Ticket> tickets = StreamSupport.stream(zendesk.getTickets().spliterator(), false).collect(Collectors.toList());
        return tickets.get(0);
        //return tickets.subList((off*lim), (off*lim)+lim);
    }*/
}
