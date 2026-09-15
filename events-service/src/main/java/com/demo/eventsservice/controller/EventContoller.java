package com.demo.eventsservice.controller;

import com.demo.eventsservice.entity.Event;
import com.demo.eventsservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;
@RestController
@RequestMapping("/api/events")
public class EventContoller {
    @Autowired
    private EventService eventService;
    @GetMapping
    public ResponseEntity<List<Event>> getAllProducts() {
        return ResponseEntity.ok(eventService.getAllEvent());
    }
}
