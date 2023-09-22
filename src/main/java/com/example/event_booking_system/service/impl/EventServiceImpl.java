package com.example.event_booking_system.service.impl;

import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.Event;
import com.example.event_booking_system.repository.EventRepository;
import com.example.event_booking_system.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
        public List<EventDto> getAllEvents() {
            List<Event> events =eventRepository.findAll();
             return  events.stream().map(event -> maptoEventDto(event)).collect(Collectors.toList());
        }

    private EventDto maptoEventDto(Event event) {
        EventDto eventDto=EventDto.builder()
                .id(event.getId())
                .eventName(event.getEventName())
                .eventDescription(event.getEventDescription())
                .eventDateTime(event.getEventDateTime())
                .venue(event.getVenue())
                .eventCategory(event.getEventCategory())
                .ticketPrice(event.getTicketPrice())
                .availableSlots(event.getAvailableSlots())
                .remainingSlots(event.getRemainingSlots())
                .eventImage(event.getEventImage())
                .bookingDeadline(event.getBookingDeadline())
                .bookingStartDate(event.getBookingStartDate())
        .build();
        return eventDto;
    }

    @Override
        public Event getEventById(Long eventId) {
            return eventRepository.findById(eventId).orElse(null);
        }

        @Override
        public Event createEvent(Event event) {
            return eventRepository.save(event);
        }

        @Override
        public Event updateEvent(Event event) {
            return eventRepository.save(event);
        }

        @Override
        public void deleteEvent(Long eventId) {
            eventRepository.deleteById(eventId);
        }
}
