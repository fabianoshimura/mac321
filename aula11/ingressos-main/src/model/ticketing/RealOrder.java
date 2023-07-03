package model.ticketing;

import java.util.ArrayList;
import java.util.List;

import model.client.Client;

public class RealOrder {
    private String id;
    private List<Ticket> tickets = new ArrayList<>();
    private Client buyer;
    private double amount;
    private int paymentStatus;
    private String dateOfPurchase;
    private int deliveryMethod;

    // Use Strategy Design Pattern to calculate fares
    private PricingStrategy pricingStrategy;

    public RealOrder(PricingStrategy strategy) {
        pricingStrategy = strategy;
    }

    public double calculateAmountDue() {
        amount = 0;        
        for (Ticket ticket: tickets) {
            amount += getPricingStrategy().getFare(ticket.getEvent().getBaseFareRate());
        }
        amount *= 1.2;
        if (deliveryMethod == Order.HOME_DELIVERY) amount += 10;
        return amount;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void addTickets(Ticket ticket) {
        tickets.add(ticket);
    }
    public Client getBuyer() {
        return buyer;
    }
    public void setBuyer(Client buyer) {
        this.buyer = buyer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }
    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    public int getDeliveryMethod() {
        return deliveryMethod;
    }
    public void setDeliveryMethod(int deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

}
