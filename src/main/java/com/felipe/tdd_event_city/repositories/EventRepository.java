package com.felipe.tdd_event_city.repositories;

import com.felipe.tdd_event_city.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
