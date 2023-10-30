package com.example.event_booking_system.service.impl;

import com.example.event_booking_system.models.event.Performer;
import com.example.event_booking_system.repository.PerformerRepository;
import com.example.event_booking_system.service.PerformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformerServiceImpl implements PerformerService {
    private  PerformerRepository performerRepository;
    @Autowired
    public PerformerServiceImpl(PerformerRepository performerRepository) {
        this.performerRepository = performerRepository;
    }
    @Override
    public List<Performer> getAllPerformers(){ return performerRepository.findAll();
    }

}
