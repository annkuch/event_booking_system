package com.example.event_booking_system.models.booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "booked_tickets")
public class BookedTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long booked_ticket_id;
    
    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column
    private String owner_name;

    @Column
    private String owner_surname;

    @Column
    private String email;
}