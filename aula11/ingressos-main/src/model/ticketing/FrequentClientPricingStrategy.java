package model.ticketing;

public class FrequentClientPricingStrategy implements PricingStrategy {

    @Override
    public double getFare(double baseFare) {
        return 0.6*baseFare;
    }
    
}
