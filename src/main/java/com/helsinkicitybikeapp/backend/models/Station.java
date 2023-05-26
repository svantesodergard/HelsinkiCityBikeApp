package com.helsinkicitybikeapp.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Station {
    @Id
    private Long id;
    private String name;
    private Long capacity;
    private Double x, y;
}
