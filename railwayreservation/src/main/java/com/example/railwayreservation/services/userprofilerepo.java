package com.example.railwayreservation.services;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.railwayreservation.model.userprofile;
@Repository
public interface userprofilerepo extends JpaRepository<userprofile,Integer>{
	@Query("select jpe from userprofile jpe where jpe.email=?1")
	userprofile findByEmail(String email);
}
