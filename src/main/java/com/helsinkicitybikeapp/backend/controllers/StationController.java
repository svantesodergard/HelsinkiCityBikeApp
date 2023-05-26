package com.helsinkicitybikeapp.backend.controllers;

import com.helsinkicitybikeapp.backend.models.Station;
import com.helsinkicitybikeapp.backend.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stations")
public class StationController {

    @Autowired
    StationRepository repository;

    //The number of stations shouldn't be too big or ever become it so retrieving all is okay.
    @GetMapping()
    public List<Station> getAllStations() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Station getStationById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

}
