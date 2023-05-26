package com.helsinkicitybikeapp.backend;

import com.helsinkicitybikeapp.backend.repositories.JourneyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelsinkiCityBikeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelsinkiCityBikeAppApplication.class, args);
	}
}
