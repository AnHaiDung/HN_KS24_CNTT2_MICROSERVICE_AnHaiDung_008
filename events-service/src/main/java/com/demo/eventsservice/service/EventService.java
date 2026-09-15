package com.demo.eventsservice.service;

import com.demo.eventsservice.entity.Event;
import com.demo.eventsservice.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    public List<Event> getAllEvent() {
        return eventRepository.findAll();
    }

}
