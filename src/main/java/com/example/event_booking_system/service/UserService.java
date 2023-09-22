package com.example.event_booking_system.service;

import com.example.event_booking_system.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long userId);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long userId);
}
