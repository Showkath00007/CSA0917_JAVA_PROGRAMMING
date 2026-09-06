package com.swiftbook.booking.concurrency;

import com.swiftbook.booking.model.SeatInventory;
import com.swiftbook.booking.exception.SeatAlreadyBookedException;

public class BookingSimulation {
    public static void main(String[] args) throws InterruptedException {
        SeatInventory inventory = new SeatInventory(20, "Standard");
        int targetSeat = 5; // both counters race for the same seat

        Runnable counterA = () -> attemptBooking(inventory, targetSeat, "Counter-A");
        Runnable counterB = () -> attemptBooking(inventory, targetSeat, "Counter-B");

        Thread t1 = new Thread(counterA);
        Thread t2 = new Thread(counterB);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Booking history: " + inventory.getBookingHistory());
    }

    private static void attemptBooking(SeatInventory inventory, int seatNumber,
                                       String customer) {
        try {
            inventory.bookSeat(seatNumber, customer);
            System.out.println(customer + " SUCCESS: booked seat " + seatNumber);
        } catch (SeatAlreadyBookedException e) {
            System.out.println(customer + " FAILED: " + e.getMessage());
        }
    }
}
