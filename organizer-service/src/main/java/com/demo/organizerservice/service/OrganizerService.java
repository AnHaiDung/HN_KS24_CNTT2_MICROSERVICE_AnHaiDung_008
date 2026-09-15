package com.demo.organizerservice.service;

import com.demo.organizerservice.entity.Organizer;
import com.demo.organizerservice.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;
@Service
public class OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;
    public Organizer getOrganizerById(Long id) {
        Optional<Organizer> organizer = organizerRepository.findById(id);
        return organizer.orElse(null);
    }


}
