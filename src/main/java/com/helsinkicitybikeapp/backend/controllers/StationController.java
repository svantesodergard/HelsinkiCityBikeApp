package com.helsinkicitybikeapp.backend.controllers;

import com.helsinkicitybikeapp.backend.models.Station;
import com.helsinkicitybikeapp.backend.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stations")
public class StationController {

    @Autowired
    StationRepository repository;

    @GetMapping("{id}")
    public Station getStationById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

}
