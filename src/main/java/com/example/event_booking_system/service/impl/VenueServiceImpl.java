package com.example.event_booking_system.service.impl;
import com.example.event_booking_system.models.event.Venue;
import com.example.event_booking_system.repository.EventRepository;
import com.example.event_booking_system.repository.VenueRepository;
import com.example.event_booking_system.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImpl  implements VenueService {
    private VenueRepository venueRepository;
    @Autowired
    public VenueServiceImpl(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public List<Venue> getAllVenues(){
        return venueRepository.findAll();
    }
}
