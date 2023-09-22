package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
