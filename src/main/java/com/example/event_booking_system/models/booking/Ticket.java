package com.example.event_booking_system.models.booking;

import com.example.event_booking_system.models.event.Event;
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
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long ticket_type_id;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @Column
    private String zone_name;

    @Column
    private int price;

    @Column
    private int amount;

    @Column
    private int available_slots;

}
