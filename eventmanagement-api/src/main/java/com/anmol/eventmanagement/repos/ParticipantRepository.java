package com.anmol.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.anmol.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
