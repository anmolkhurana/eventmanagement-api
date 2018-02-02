package com.anmol.eventmanagement.repos;

import java.time.ZoneId;
//import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.anmol.eventmanagement.entities.Event;
import com.anmol.eventmanagement.entities.projections.PartialEventProjection;
//Applying excerpts only for default behavior. But it is only applied on collections not for a single item.
@RepositoryRestResource(excerptProjection=PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
	//Simply to search by Name and get results as a list
	//List<Event> findByName(@Param("name") String name); 
	//OR to get page information
	Page<Event> findByName(@Param("name") String name, Pageable pageable);
	
	Page<Event> findByNameAndZoneId(@Param("name")String name, @Param("zoneId")ZoneId zoneId, Pageable pageable); 
	
}
