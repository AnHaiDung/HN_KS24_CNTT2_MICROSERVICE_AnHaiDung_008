package com.demo.organizerservice.controller;

import com.demo.organizerservice.entity.Organizer;
import com.demo.organizerservice.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
@RequestMapping("/api/organizers")
public class OrganizerController {
    @Autowired
    private OrganizerService organizerService;
    @GetMapping("/{id}")
    public ResponseEntity<Organizer> getCategoryById(@PathVariable Long id) {
        Organizer organizer = organizerService.getOrganizerById(id);
        if (organizer != null) {
            return ResponseEntity.ok(organizer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
