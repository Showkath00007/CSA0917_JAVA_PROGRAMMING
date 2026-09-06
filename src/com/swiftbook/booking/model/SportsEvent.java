package com.swiftbook.booking.model;

public class SportsEvent extends Event {
    private final String homeTeam;
    private final String awayTeam;
    private static final double PREMIUM_SURCHARGE = 0.25; // 25%

    public SportsEvent(String eventId, String name, double basePrice,
                       String homeTeam, String awayTeam) {
        super(eventId, name, basePrice);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public double computeFinalPrice(String seatCategory) {
        double price = getBaseTicketPrice();
        if ("PREMIUM".equalsIgnoreCase(seatCategory)) {
            price += price * PREMIUM_SURCHARGE;
        }
        return price;
    }

    public String getHomeTeam() { return homeTeam; }
    public String getAwayTeam() { return awayTeam; }
}
