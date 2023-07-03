package model.ticketing;

import model.client.Client;
import model.event.Event;

public interface Ticket {
    public int getId();
    public Client getHolder();
    public Event getEvent();
    public String toString();
}
