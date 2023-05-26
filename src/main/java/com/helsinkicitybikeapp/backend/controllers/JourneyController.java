package com.helsinkicitybikeapp.backend.controllers;

import com.helsinkicitybikeapp.backend.models.Journey;
import com.helsinkicitybikeapp.backend.repositories.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("journeys")
public class JourneyController {

    @Autowired
    JourneyRepository repository;

    @GetMapping("all/{pageNumber}")
    public List<Journey> getAllJourneysBetween(@PathVariable Integer pageNumber) {
        return repository.findAll(PageRequest.of(pageNumber, 20)).toList();
    }

    @GetMapping("{id}")
    public Journey getJourneyById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @GetMapping("{id}/duration")
    public Long getDurationInMinutesForJourney(@PathVariable Long id) {
        return Math.round(getJourneyById(id).getDuration() / 60.0);
    }


}
