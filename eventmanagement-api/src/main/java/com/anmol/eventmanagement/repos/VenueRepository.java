package com.anmol.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.anmol.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}
