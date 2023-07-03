package model.ticketing;

public interface Order {
    int PAID = 1;
    int PAYMENT_PENDING = 0;
    int RECUSED = -1;

    int HOME_DELIVERY = 1;
    int PICKUP = 0;

    public double calculateAmountDue();
}
