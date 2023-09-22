package com.example.event_booking_system.controller;


import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.Event;
import com.example.event_booking_system.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    private EventService eventService;
    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/all")
    public String listEvents(Model model) {
        List<EventDto> events =eventService.getAllEvents();
        model.addAttribute("events", events);
        return "events-list";
    }

    @GetMapping("/{eventId}")
    public Event getEventById(@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }


}
