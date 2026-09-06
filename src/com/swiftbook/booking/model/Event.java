package com.swiftbook.booking.model;

public abstract class Event {
    private final String eventId;
    private final String name;
    private final double baseTicketPrice;

    public Event(String eventId, String name, double baseTicketPrice) {
        this.eventId = eventId;
        this.name = name;
        this.baseTicketPrice = baseTicketPrice;
    }

    public String getEventId() { return eventId; }
    public String getName() { return name; }
    public double getBaseTicketPrice() { return baseTicketPrice; }

    // Polymorphic pricing rule - implemented differently per event type
    public abstract double computeFinalPrice(String seatCategory);

    @Override
    public String toString() {
        return String.format("[%s] %s (Base: Rs.%.2f)", eventId, name, baseTicketPrice);
    }
}
