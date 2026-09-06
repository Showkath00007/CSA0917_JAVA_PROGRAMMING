package com.swiftbook.booking.exception;

// User-defined checked exception (CO2)
public class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
