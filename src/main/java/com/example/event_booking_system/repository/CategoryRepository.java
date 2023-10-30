package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.event.Category;
import com.example.event_booking_system.models.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
