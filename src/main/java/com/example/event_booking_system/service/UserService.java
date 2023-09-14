package com.example.event_booking_system.service;

import com.example.event_booking_system.entity.Booking;
import com.example.event_booking_system.entity.User;
import com.example.event_booking_system.repository.BookingRepository;
import com.example.event_booking_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {return userRepository.findAll(); }
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
