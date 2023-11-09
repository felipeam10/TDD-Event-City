package com.felipe.tdd_event_city.repositories;

import com.felipe.tdd_event_city.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
