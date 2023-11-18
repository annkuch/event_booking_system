package com.example.event_booking_system.models.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Reference to the Performer entity
    @JoinColumn(name = "performer_id")
    private Performer performer;

    @Column(name = "event_name")
    private String eventName;

    @Column(columnDefinition = "TEXT")
    private String event_description;

    @Column(name = "event_date_time", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime eventDateTime;

    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category eventCategory;

    @Column(name = "event_image")
    private String eventImage;


    @Column(name = "booking_deadline", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime bookingDeadline;

}
