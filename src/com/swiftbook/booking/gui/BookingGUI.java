package com.swiftbook.booking.gui;

import java.awt.*;
import java.awt.event.*;
import com.swiftbook.booking.model.SeatInventory;
import com.swiftbook.booking.exception.SeatAlreadyBookedException;

public class BookingGUI extends Frame {
    private final SeatInventory inventory;
    private int selectedSeat = -1;
    private final List bookingLog = new List(8);

    public BookingGUI(SeatInventory inventory) {
        this.inventory = inventory;
        setTitle("SwiftBook Live - Seat Booking");
        setSize(520, 480);
        setLayout(new BorderLayout());

        Panel seatGrid = new Panel(new GridLayout(4, 5, 5, 5));
        for (int i = 1; i <= 20; i++) {
            Button seatBtn = new Button("S" + i);
            final int seatNum = i;
            seatBtn.addActionListener(e -> selectedSeat = seatNum); // Listener 1
            seatGrid.add(seatBtn);
        }

        Panel controlPanel = new Panel();
        Button bookBtn = new Button("Book");
        Button cancelBtn = new Button("Cancel");

        bookBtn.addActionListener(e -> { // Listener 2
            try {
                inventory.bookSeat(selectedSeat, "Counter-Customer");
                bookingLog.add("Seat " + selectedSeat + " booked");
            } catch (SeatAlreadyBookedException ex) {
                bookingLog.add("Failed: " + ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException ex) {
                bookingLog.add("Invalid seat selected.");
            } finally {
                repaint();
            }
        });

        cancelBtn.addActionListener(e -> {
            try {
                inventory.cancelSeat(selectedSeat);
                bookingLog.add("Seat " + selectedSeat + " cancelled");
            } catch (ArrayIndexOutOfBoundsException ex) {
                bookingLog.add("Invalid seat selected.");
            } finally {
                repaint();
            }
        });

        controlPanel.add(bookBtn);
        controlPanel.add(cancelBtn);

        add(seatGrid, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(bookingLog, BorderLayout.EAST);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); }
        });

        setVisible(true);
    }
}
