package com.example.railwayreservation.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railwayreservation.model.userprofile;


@Service
public class userprofileservice {
	@Autowired
    userprofilerepo jpe;
    public userprofile signUp(userprofile ups) {
    	return this.jpe.save(ups);
    }
//    private userprofilerepo userrepo;
//    public boolean validuser(String email,String password){
//		Optional<userprofile> userProfile = userrepo.findByEmail(email);
//		return userProfile.isPresent() && userProfile.get().getPassword().equals(password);
//    }
    public userprofile getUser(String email) {
    	return this.jpe.findByEmail(email);
    }
}
