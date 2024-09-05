package com.example.railwayreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trains")
public class trainmodel{
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="trainid")
int trainid ;
@Column(name="trainno")
int trainno;
@Column(name="trainname")
String trainname;
@Column(name="source")
String source;
@Column(name="destination")
String destination;
@Column(name="noofseats")
int noofseats;
@Column(name="sleeper")
int sleeper;
@Column(name="seater")
int seater;
@Column(name="noofstops")
int noofstops;
@Column(name="stops")
String stops;
@Column(name="arrival")
String arrival;
@Column(name="departure")
String departure;
public int getTrainid() {
	return trainid;
}
public void setTrainid(int trainid) {
	this.trainid = trainid;
}
public int getTrainno() {
	return trainno;
}
public void setTrainno(int trainno) {
	this.trainno = trainno;
}
public String getTrainname() {
	return trainname;
}
public void setTrainname(String trainname) {
	this.trainname = trainname;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getNoofseats() {
	return noofseats;
}
public void setNoofseats(int noofseats) {
	this.noofseats = noofseats;
}
public int getSleeper() {
	return sleeper;
}
public void setSleeper(int sleeper) {
	this.sleeper = sleeper;
}
public int getSeater() {
	return seater;
}
public void setSeater(int seater) {
	this.seater = seater;
}
public int getNoofstops() {
	return noofstops;
}
public void setNoofstops(int noofstops) {
	this.noofstops = noofstops;
}
public String getStops() {
	return stops;
}
public void setStops(String stops) {
	this.stops = stops;
}
public String getArrival() {
	return arrival;
}
public void setArrival(String arrival) {
	this.arrival = arrival;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}



}
