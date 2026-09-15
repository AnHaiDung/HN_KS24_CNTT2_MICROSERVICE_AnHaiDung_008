package com.demo.organizerservice.repository;

import com.demo.organizerservice.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
