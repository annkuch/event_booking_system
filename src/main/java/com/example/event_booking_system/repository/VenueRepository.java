package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.event.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
