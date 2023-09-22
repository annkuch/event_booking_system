package com.example.event_booking_system.service;

import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.Event;

import java.util.List;

public interface EventService {
    List<EventDto> getAllEvents();

    Event getEventById(Long eventId);

    Event createEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(Long eventId);
}
