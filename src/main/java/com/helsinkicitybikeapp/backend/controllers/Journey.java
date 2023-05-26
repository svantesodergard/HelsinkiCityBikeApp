package com.helsinkicitybikeapp.backend.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Data
public class Journey {
    @Id
    private Long id;

    @OneToOne
    private Station departureStation;
    @OneToOne
    private Station arrivalStation;

    private Long distanceCoveredInMeters;
    private LocalDateTime departure;
    private LocalDateTime arrival;

    public Long getDuration() {
        return Duration.between(departure, arrival).getSeconds();
    }
}
