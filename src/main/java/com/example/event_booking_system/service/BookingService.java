package com.example.event_booking_system.service;

import com.example.event_booking_system.models.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookingService {
    public List<Booking> getAllBookings();
    public Booking getBookingById(Long bookingId);

    Booking createBooking(Booking booking);

    Booking updateBooking(Booking booking);

    void deleteBooking(Long bookingId);
}
