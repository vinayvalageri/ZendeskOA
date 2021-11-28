package com.zendesk.vinay.model;

import java.io.Serializable;
import java.util.List;

public class TicketListResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Ticket> tickets;
    private long count;

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
