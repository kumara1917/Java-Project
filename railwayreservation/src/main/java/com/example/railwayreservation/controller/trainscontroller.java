package com.example.railwayreservation.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.railwayreservation.model.trainmodel;
import com.example.railwayreservation.services.trainsservices;

@RestController
@RequestMapping("trains")
public class trainscontroller {
	@Autowired
	trainsservices ts;
	@PostMapping("/insert_trains")
	public trainmodel inserttrains(@RequestBody trainmodel tr){
	return this.ts.addtrains(tr);

	}
	@PostMapping("/display_trains")
	public List<trainmodel> displayTrains(@RequestBody trainmodel tr){
		return this.ts.displaytrains(tr.getSource(),tr.getDestination());
		
	}
	
}
