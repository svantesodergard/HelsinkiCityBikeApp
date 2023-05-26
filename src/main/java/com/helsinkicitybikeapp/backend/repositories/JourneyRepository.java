package com.helsinkicitybikeapp.backend.repositories;

import com.helsinkicitybikeapp.backend.models.Journey;
import com.helsinkicitybikeapp.backend.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface JourneyRepository extends JpaRepository<Journey, Long> {

    Collection<Journey> findAllByDepartureStation(Station station);

    Collection<Journey> findAllByArrivalStation(Station station);
}
