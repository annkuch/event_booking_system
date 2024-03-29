package com.example.event_booking_system.service.impl;

import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.event.Event;
import com.example.event_booking_system.repository.EventRepository;
import com.example.event_booking_system.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.event_booking_system.mapper.EventMapper.maptoEvent;
import static com.example.event_booking_system.mapper.EventMapper.maptoEventDto;

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

    @Override
        public Event getEventById(Long eventId) {

        return eventRepository.findById(eventId).orElse(null);
        }

        @Override
        public Event createEvent(Event event) {
            return eventRepository.save(event);
        }

        @Override
        public void updateEvent(EventDto eventDto) {
        Event event = maptoEvent(eventDto);
        eventRepository.save(event);
        }


    @Override
        public void deleteEvent(Long eventId) {

        eventRepository.deleteById(eventId);
        }

        @Override
        public void saveEvent(Event event) {
            eventRepository.save(event);
        }

    @Override
    public EventDto findEventById(Long eventId) {
        Event event = eventRepository.findById(eventId).get();
        return maptoEventDto(event);
    }

    @Override
    public List<EventDto> searchEvents(String query) {
        List<Event> events = eventRepository.searchEvents(query);
        return events.stream().map(event -> maptoEventDto(event)).collect(Collectors.toList());
    }
}
