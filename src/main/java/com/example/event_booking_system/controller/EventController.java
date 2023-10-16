package com.example.event_booking_system.controller;


import com.example.event_booking_system.dto.EventDto;
import com.example.event_booking_system.models.event.Category;
import com.example.event_booking_system.models.event.Event;
import com.example.event_booking_system.models.event.Performer;
import com.example.event_booking_system.models.event.Venue;
import com.example.event_booking_system.service.CategoryService;
import com.example.event_booking_system.service.EventService;
import com.example.event_booking_system.service.PerformerService;
import com.example.event_booking_system.service.VenueService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    private EventService eventService;
    @Autowired
    private PerformerService performerService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private VenueService venueService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/all")
    public String listEvents(Model model) {
        List<EventDto> events = eventService.getAllEvents();
        model.addAttribute("events", events);
        return "events-list";
    }

    @GetMapping("/new")
    public String createEvent(Model model) {
        Event event = new Event();
        model.addAttribute("event", event);
        List<Performer> performers = performerService.getAllPerformers();
        model.addAttribute("performers", performers);

        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);

        List<Venue> venues = venueService.getAllVenues();
        model.addAttribute("venues", venues);

        return "events-create";
    }

    @PostMapping("/new")
    public String saveEvent(@Valid @ModelAttribute("event") Event event,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "events-create";
        }
        eventService.saveEvent(event);
        return "redirect:/events/all";
    }

    @GetMapping("/{eventId}/edit")
    public String editEventForm(@PathVariable("eventId") Long eventId, Model model) {
        EventDto event = eventService.findEventById(eventId);
        model.addAttribute("event", event);
        List<Performer> performers = performerService.getAllPerformers();
        model.addAttribute("performers", performers);

        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);

        List<Venue> venues = venueService.getAllVenues();
        model.addAttribute("venues", venues);
        return "events-edit";
    }

    @PostMapping("/{eventId}/edit")
    public String updateEvent(@PathVariable("eventId") Long eventId,
                              @Valid @ModelAttribute("event") EventDto event,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "events-edit";
        }
        event.setId(eventId);
        eventService.updateEvent(event);
        return "redirect:/events/all";

    }
    @GetMapping("/{eventId}")
    public String eventDetail(@PathVariable("eventId") Long eventId, Model model){
        EventDto eventDto = eventService.findEventById(eventId);
        model.addAttribute("event", eventDto);
        return "event-detail";
    }

    @GetMapping("/{eventId}/delete")
    public String deleteEvent(@PathVariable("eventId") Long eventId) {
        eventService.deleteEvent(eventId);
        return "redirect:/events/all";
    }
    @GetMapping("/search")
    public String searchEvents(@RequestParam("query") String query, Model model){
        List<EventDto> events = eventService.searchEvents(query);
        model.addAttribute("events", events);
        return "events-list";
    }


}