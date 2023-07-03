package model.ticketing;

import model.client.Client;
import model.event.Event;

public class RealTicket implements Ticket {
    private int id;
    private Client holder;
    private Event event;
    
    public RealTicket(int id, Client holder, Event event) {
        this.id = id;
        this.holder = holder;
        this.event = event;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Client getHolder() {
        return holder;
    }

    @Override
    public Event getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", holder=" + holder.getName() + ", event=" + event.getDescription() + "]";
    }    
    
}
