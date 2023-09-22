package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.Event;
import com.example.event_booking_system.models.Venue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByEventName(String eventName);

    List<Event> findByEventDateTimeGreaterThan(Date eventDateTime);

    List<Event> findByVenue(Venue venue);

    List<Event> findByEventCategory(String category);

    Page<Event> findAll(Pageable pageable);

    // Custom SQL query example
    @Query("SELECT e FROM Event e WHERE e.ticketPrice < :maxPrice")
    List<Event> findEventsWithTicketPriceLessThan(double maxPrice);
}
