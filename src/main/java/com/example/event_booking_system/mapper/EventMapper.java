package com.example.event_booking_system.mapper;

import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.event.Event;

public class EventMapper {
    public static Event maptoEvent(EventDto event) {
        Event eventDto = Event.builder()
                .id(event.getId())
                .performer(event.getPerformer())
                .eventName(event.getEventName())
                .event_description(event.getEvent_description())
                .eventDateTime(event.getEventDateTime())
                .venue(event.getVenue())
                .eventCategory(event.getEventCategory())
                .eventImage(event.getEventImage())
                .bookingDeadline(event.getBookingDeadline())
                .build();
        return eventDto;
    }

    public static EventDto maptoEventDto(Event event) {
        EventDto eventDto=EventDto.builder()
                .id(event.getId())
                .performer(event.getPerformer())
                .eventName(event.getEventName())
                .event_description(event.getEvent_description())
                .eventDateTime(event.getEventDateTime())
                .venue(event.getVenue())
                .eventCategory(event.getEventCategory())
                .eventImage(event.getEventImage())
                .bookingDeadline(event.getBookingDeadline())
                .build();
        return eventDto;
    }


}
