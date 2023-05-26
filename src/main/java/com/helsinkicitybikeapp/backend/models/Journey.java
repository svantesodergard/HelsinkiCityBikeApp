package com.helsinkicitybikeapp.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Data
public class Journey {
    @Id
    private Long id;

    @ManyToOne
    private Station departureStation;
    @ManyToOne
    private Station arrivalStation;

    private Long distanceCoveredInMeters;
    private LocalDateTime departure;
    private LocalDateTime arrival;

    public Long getDuration() {
        return Duration.between(departure, arrival).getSeconds();
    }
}
