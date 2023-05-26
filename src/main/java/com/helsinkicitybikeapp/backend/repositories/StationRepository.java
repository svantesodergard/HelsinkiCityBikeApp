package com.helsinkicitybikeapp.backend.repositories;

import com.helsinkicitybikeapp.backend.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {

}
