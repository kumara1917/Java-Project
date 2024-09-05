package com.example.railwayreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="journeymap")
public class journeymap {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="jourid ")
int jourid ;
@Column(name="seatid")
int seatid;
@Column(name="aadharnumber")
int aadharnumber;
public int getJourid() {
	return jourid;
}
public void setJourid(int jourid) {
	this.jourid = jourid;
}
public int getSeatid() {
	return seatid;
}
public void setSeatid(int seatid) {
	this.seatid = seatid;
}
public int getAadharnumber() {
	return aadharnumber;
}
public void setAadharnumber(int aadharnumber) {
	this.aadharnumber = aadharnumber;
}




}