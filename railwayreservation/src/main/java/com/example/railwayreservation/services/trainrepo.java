package com.example.railwayreservation.services;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.railwayreservation.model.trainmodel;

@Repository
public interface trainrepo extends JpaRepository<trainmodel,Integer>{
	@Query("select tp from trainmodel tp where tp.source=?1 and tp.destination=?2")
	List<trainmodel> gettrains(String source,String destination);
}
