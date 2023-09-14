package com.example.event_booking_system.service;

import com.example.event_booking_system.entity.Event;
import com.example.event_booking_system.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
        @Autowired
        private EventRepository eventRepository;

        public List<Event> getAllEvents() {
            return eventRepository.findAll();
        }

        public Event getEventById(Long eventId) {
            return eventRepository.findById(eventId).orElse(null);
        }

        public Event createEvent(Event event) {
            return eventRepository.save(event);
        }

        public Event updateEvent(Event event) {
            return eventRepository.save(event);
        }

        public void deleteEvent(Long eventId) {
            eventRepository.deleteById(eventId);
        }
}
