package com.example.event_booking_system.models.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "performers")
public class Performer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "performer_seq")
    @SequenceGenerator(name = "performer_seq", sequenceName = "performers_id_seq", allocationSize = 1)
    private Long id;
    @Column
    private String performer_name;

    @Column (columnDefinition = "TEXT")
    private String performer_description;

}
