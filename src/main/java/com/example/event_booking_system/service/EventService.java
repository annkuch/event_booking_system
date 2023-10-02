package com.example.event_booking_system.service;

import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.event.Event;

import java.util.List;

public interface EventService {
    List<EventDto> getAllEvents();

    Event getEventById(Long eventId);

    Event createEvent(Event event);

    void updateEvent(EventDto event);

    void deleteEvent(Long eventId);

    void saveEvent(Event event);

    EventDto findEventById(Long eventId);
    List<EventDto> searchEvents(String query);
}
