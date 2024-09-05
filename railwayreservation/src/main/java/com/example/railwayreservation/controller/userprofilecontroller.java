package com.example.railwayreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.railwayreservation.model.userprofile;
import com.example.railwayreservation.services.userprofileservice;

@RestController
@RequestMapping("userprofile")
public class userprofilecontroller {
	@Autowired
	userprofileservice ups;
	@PostMapping("/sign_up")
	public userprofile signup(@RequestBody userprofile up) {
		return this.ups.signUp(up);
	}
//	@PostMapping("/login")
//	public String login(@RequestBody userprofile up) {
//		if(ups.validuser(up.getEmail(),up.getPassword())) {
//			return "Login succusfull";
//		}
//		else {
//			return "Invalid email or password";
//		}
//	}
	@GetMapping("/login/{email}")
	public userprofile login(@PathVariable String email) {
		return this.ups.getUser(email);
	}
}
