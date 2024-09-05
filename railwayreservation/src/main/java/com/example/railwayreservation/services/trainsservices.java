package com.example.railwayreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railwayreservation.model.trainmodel;

import java.util.List;

@Service
public class trainsservices {
	@Autowired
	trainrepo tp;
	public trainmodel addtrains(trainmodel ts) {
    	return this.tp.save(ts);
	}
	public List<trainmodel> displaytrains(String source,String destination){
		return this.tp.gettrains(source,destination);
	}
}

