package model.event;

public interface Event {
    public int getId();
    public String getDescription();
    public String getStartDateAndTime();
    public String getPlace();
    public int getAvailableTickets();
    public double getBaseFareRate();

    public String toString();
}
