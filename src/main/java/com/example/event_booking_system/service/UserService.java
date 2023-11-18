package com.example.event_booking_system.service;

import com.example.event_booking_system.dto.RegistrationDto;
import com.example.event_booking_system.models.user.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long userId);

    void saveUser(RegistrationDto registrationDto);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long userId);

    User findByEmail(String email);
}
