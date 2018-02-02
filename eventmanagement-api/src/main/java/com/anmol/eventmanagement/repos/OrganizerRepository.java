package com.anmol.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.anmol.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
