package com.swiftbook.booking;

import java.util.Scanner;
import com.swiftbook.booking.model.*;
import com.swiftbook.booking.concurrency.BookingSimulation;
import com.swiftbook.booking.gui.BookingGUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println(" SwiftBook Live - Event Ticket Booking System");
        System.out.println(" Course: CSA09 - Programming in Java");
        System.out.println("=================================================");
        System.out.println("Select an option to run:");
        System.out.println("1. Launch GUI (AWT Desktop App)");
        System.out.println("2. Run Multithreaded Concurrency Simulation");
        System.out.println("3. Run Verification Tests (TC1 - TC6)");
        System.out.print("Enter choice (1-3): ");

        Scanner sc = new Scanner(System.in);
        String choice = "2";
        if (sc.hasNextLine()) {
            choice = sc.nextLine().trim();
        }

        switch (choice) {
            case "1":
                System.out.println("Starting GUI...");
                SeatInventory guiInventory = new SeatInventory(20, "Standard");
                new BookingGUI(guiInventory);
                break;
            case "2":
                System.out.println("Running Concurrency Simulation...");
                try {
                    BookingSimulation.main(new String[]{});
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "3":
                runTests();
                break;
            default:
                System.out.println("Running concurrency simulation by default.");
                try {
                    BookingSimulation.main(new String[]{});
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    private static void runTests() {
        System.out.println("\n--- Running Test Cases ---");
        SeatInventory inv = new SeatInventory(20, "Standard");

        // TC1: Book available seat
        try {
            inv.bookSeat(5, "User1");
            System.out.println("TC1 (Book seat 5): PASS");
        } catch (Exception e) {
            System.out.println("TC1: FAIL - " + e.getMessage());
        }

        // TC2: Out-of-range seat
        try {
            inv.bookSeat(99, "User2");
            System.out.println("TC2: FAIL - Out of range not caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("TC2 (Out-of-range seat 99): PASS (Caught expected " + e.getClass().getSimpleName() + ")");
        } catch (Exception e) {
            System.out.println("TC2: FAIL - Unexpected exception " + e);
        }

        // TC4: Double booking detection
        try {
            inv.bookSeat(5, "User3");
            System.out.println("TC4: FAIL - Double booking not caught");
        } catch (Exception e) {
            System.out.println("TC4 (Double booking on seat 5): PASS (Caught expected " + e.getMessage() + ")");
        }

        // TC5: Cancel booked seat
        try {
            inv.cancelSeat(5);
            System.out.println("TC5 (Cancel seat 5): PASS");
        } catch (Exception e) {
            System.out.println("TC5: FAIL - " + e.getMessage());
        }

        // TC6: List available seats (Iterator / Generics)
        System.out.println("TC6 (Available seats): " + inv.getAvailableSeats());
        System.out.println("All test cases completed.");
    }
}
