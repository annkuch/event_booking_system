package com.example.event_booking_system.service.impl;

import com.example.event_booking_system.dto.RegistrationDto;
import com.example.event_booking_system.models.user.User;
import com.example.event_booking_system.models.user.UserRole;
import com.example.event_booking_system.repository.UserRepository;
import com.example.event_booking_system.repository.UserRoleRepository;
import com.example.event_booking_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        User user = new User();
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        user.setFirstname(registrationDto.getFirstname());
        user.setLastname(registrationDto.getLastname());
        user.setPhone(registrationDto.getPhone());
        UserRole userRole = userRoleRepository.findByName("USER");
        user.setUser_roles(Arrays.asList(userRole));
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {return userRepository.findAll(); }
    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
