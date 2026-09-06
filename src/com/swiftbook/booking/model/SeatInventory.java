package com.swiftbook.booking.model;

import java.util.*;
import com.swiftbook.booking.exception.SeatAlreadyBookedException;

public class SeatInventory {
    private final Map<Integer, Seat> seatMap = new HashMap<>();
    private final List<String> bookingHistory =
            Collections.synchronizedList(new ArrayList<>());

    public SeatInventory(int totalSeats, String category) {
        for (int i = 1; i <= totalSeats; i++) {
            seatMap.put(i, new Seat(i, category));
        }
    }

    private Seat getSeat(int seatNumber) {
        if (!seatMap.containsKey(seatNumber)) {
            throw new ArrayIndexOutOfBoundsException(
                    "Seat number " + seatNumber + " is out of range.");
        }
        return seatMap.get(seatNumber);
    }

    // synchronized: prevents two threads from booking the same seat at once
    public synchronized void bookSeat(int seatNumber, String customerName)
            throws SeatAlreadyBookedException {
        Seat seat = getSeat(seatNumber);
        if (seat.getStatus() == SeatStatus.BOOKED) {
            throw new SeatAlreadyBookedException(
                    "Seat " + seatNumber + " is already booked.");
        }
        seat.setStatus(SeatStatus.BOOKED);
        bookingHistory.add(customerName + " booked seat " + seatNumber);
    }

    public synchronized void cancelSeat(int seatNumber) {
        getSeat(seatNumber).setStatus(SeatStatus.AVAILABLE);
        bookingHistory.add("Seat " + seatNumber + " cancelled");
    }

    // Generics + Iterator usage while searching for available seats
    public Set<Integer> getAvailableSeats() {
        Set<Integer> available = new TreeSet<>();
        Iterator<Map.Entry<Integer, Seat>> it = seatMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Seat> entry = it.next();
            if (entry.getValue().getStatus() == SeatStatus.AVAILABLE) {
                available.add(entry.getKey());
            }
        }
        return available;
    }

    public List<String> getBookingHistory() { return bookingHistory; }
}
