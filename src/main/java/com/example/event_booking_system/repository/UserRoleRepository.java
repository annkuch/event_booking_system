package com.example.event_booking_system.repository;

import com.example.event_booking_system.models.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    UserRole findByName(String name);
}
