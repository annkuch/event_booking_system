package com.example.event_booking_system.service.impl;

import com.example.event_booking_system.models.booking.Booking;
import com.example.event_booking_system.repository.BookingRepository;
import com.example.event_booking_system.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {return bookingRepository.findAll(); }
    @Override
    public Booking getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }
    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
    @Override

    public Booking updateBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
    @Override

    public void deleteBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}
