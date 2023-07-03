package model.event;

public class ConcreteEvent implements Event {

    private int id;
    private String description;
    private String startDate;
    private String place;
    private int availableTickets;
    private double baseFare;

    public ConcreteEvent(int id, String description, String startDate, String place, int availableTickets,
            double baseFare) {
        this.id = id;
        this.description = description;
        this.startDate = startDate;
        this.place = place;
        this.availableTickets = availableTickets;
        this.baseFare = baseFare;
    }

    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getStartDateAndTime() {
        return startDate;
    }
    @Override
    public String getPlace() {
        return place;
    }
    @Override
    public int getAvailableTickets() {
        return availableTickets;
    }
    @Override
    public double getBaseFareRate() {
        return baseFare;
    }

    @Override
    public String toString() {
        return description + " [id=" + id + ", startDate=" + startDate + ", place="
                + place + ", availableTickets=" + availableTickets + ", baseFare=" + baseFare + "]";
    }
    
    
}
