package com.swiftbook.booking.model;

public class Seat {
    private final int seatNumber;
    private final String category;
    private SeatStatus status;

    public Seat(int seatNumber, String category) {
        this.seatNumber = seatNumber;
        this.category = category;
        this.status = SeatStatus.AVAILABLE;
    }

    public int getSeatNumber() { return seatNumber; }
    public String getCategory() { return category; }
    public SeatStatus getStatus() { return status; }
    public void setStatus(SeatStatus status) { this.status = status; }
}
