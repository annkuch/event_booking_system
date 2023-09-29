package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
