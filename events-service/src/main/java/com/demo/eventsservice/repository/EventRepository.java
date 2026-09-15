package com.demo.eventsservice.repository;

import com.demo.eventsservice.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
