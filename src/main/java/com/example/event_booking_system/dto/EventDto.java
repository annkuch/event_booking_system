package com.example.event_booking_system.dto;

import com.example.event_booking_system.models.event.Category;
import com.example.event_booking_system.models.event.Performer;
import com.example.event_booking_system.models.event.Venue;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
public class EventDto {
    private Long id;
    @NotEmpty(message = "Performer is required")
    private Performer performer;
    @NotEmpty(message = "Event Name is required")
    private String eventName;
    private String event_description;
    @NotEmpty(message = "Event Date is required")
    private LocalDateTime eventDateTime;
    @NotEmpty(message = "Event Venue is required")
    private Venue venue;
    @NotEmpty(message = "Event Category is required")
    private Category eventCategory;
    private String eventImage;
    @NotEmpty(message = "Booking Deadline is required")
    private LocalDateTime bookingDeadline;
}
