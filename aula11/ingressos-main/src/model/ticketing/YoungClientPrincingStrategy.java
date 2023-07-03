package model.ticketing;

public class YoungClientPrincingStrategy implements PricingStrategy {

    @Override
    public double getFare(double baseFare) {
        return 0.5*baseFare;
    }
    
}
