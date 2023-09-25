package com.example.event_booking_system.dto;

import com.example.event_booking_system.models.user.UserRole;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class UserDto {
    private Long id;
    private String password;
    private String email;
    private Set<UserRole> roles;
    private String firstname;
    private String lastname;
    private String phone;
}
