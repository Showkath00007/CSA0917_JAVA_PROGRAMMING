package com.swiftbook.booking.dao;

import java.sql.*;

public class BookingDAO {
    private static final String URL = "jdbc:sqlite:swiftbook.db";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS bookings (" +
                "booking_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "event_id TEXT NOT NULL, seat_number INTEGER NOT NULL, " +
                "customer_name TEXT NOT NULL, status TEXT NOT NULL)";
        try (Connection con = getConnection(); Statement st = con.createStatement()) {
            st.execute(sql);
        }
    }

    public void insertBooking(String eventId, int seatNumber, String customer)
            throws SQLException {
        String sql = "INSERT INTO bookings (event_id, seat_number, " +
                "customer_name, status) VALUES (?, ?, ?, 'BOOKED')";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, eventId);
            ps.setInt(2, seatNumber);
            ps.setString(3, customer);
            ps.executeUpdate();
        }
    }

    public void updateBookingStatus(int seatNumber, String status)
            throws SQLException {
        String sql = "UPDATE bookings SET status = ? WHERE seat_number = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, status);
            ps.setInt(2, seatNumber);
            ps.executeUpdate();
        }
    }

    public void deleteBooking(int seatNumber) throws SQLException {
        String sql = "DELETE FROM bookings WHERE seat_number = ?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, seatNumber);
            ps.executeUpdate();
        }
    }
}
