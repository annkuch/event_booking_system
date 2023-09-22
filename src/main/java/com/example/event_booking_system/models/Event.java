package com.example.event_booking_system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(nullable = false)
    private String eventName;

    @Column(columnDefinition = "TEXT")
    private String eventDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date eventDateTime;
    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category eventCategory;

    @Column(nullable = false)
    private double ticketPrice;

    @Column(nullable = false)
    private int availableSlots;

    @Column(nullable = false)
    private int remainingSlots;

    @Column
    private String eventImage;


    @Column(nullable = false)
    private String eventStatus;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date bookingDeadline;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date bookingStartDate;

}
