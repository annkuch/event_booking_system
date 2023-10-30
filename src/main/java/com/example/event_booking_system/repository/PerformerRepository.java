package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.event.Performer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformerRepository extends JpaRepository<Performer, Long> {
}
