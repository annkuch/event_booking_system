package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.event.Category;
import com.example.event_booking_system.models.event.Event;
import com.example.event_booking_system.models.event.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByEventName(String eventName);

    List<Event> findByEventDateTimeGreaterThan(Date eventDateTime);

    List<Event> findByVenue(Venue venue);

    List<Event> findByEventCategory(Category category);
    @Query("SELECT e FROM Event e WHERE LOWER(e.eventName) LIKE LOWER(CONCAT('%', :query, '%'))")
    List<Event> searchEvents(String query);
   }
