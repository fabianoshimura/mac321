package model.ticketing;

public interface PricingStrategy {
    public double getFare(double baseFare);
}
