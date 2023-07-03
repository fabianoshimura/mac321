package model.ticketing;

public class RegularClientPricingStrategy implements PricingStrategy {
    @Override
    public double getFare(double baseFare) {
        return baseFare;
    }
}
