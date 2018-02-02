package com.anmol.eventmanagement.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.anmol.eventmanagement.entities.Participant;

@Projection(name = "participantPartial", types = { Participant.class })
public interface PartialParticipantProjection {
	String getName();

	Boolean getCheckedIn();

}
