package com.example.event_booking_system.dto;

import com.example.event_booking_system.models.Venue;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class EventDto {
    private Long id;
    private String eventName;
    private String eventDescription;
    private Date eventDateTime;
    private Venue venue;
    private String eventCategory;
    private double ticketPrice;
    private int availableSlots;
    private int remainingSlots;
    private String eventImage;
    private String eventStatus;
    private Date bookingDeadline;
    private Date bookingStartDate;
}
