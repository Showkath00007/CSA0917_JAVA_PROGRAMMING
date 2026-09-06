package com.swiftbook.booking.model;

public class ConcertEvent extends Event {
    private final String artist;
    private static final double VIP_SURCHARGE = 0.40; // 40%

    public ConcertEvent(String eventId, String name, double basePrice, String artist) {
        super(eventId, name, basePrice);
        this.artist = artist;
    }

    @Override
    public double computeFinalPrice(String seatCategory) {
        double price = getBaseTicketPrice();
        if ("VIP".equalsIgnoreCase(seatCategory)) {
            price += price * VIP_SURCHARGE;
        }
        return price;
    }

    public String getArtist() { return artist; }
}
