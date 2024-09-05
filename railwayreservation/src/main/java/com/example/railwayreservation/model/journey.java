package com.example.railwayreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	

@Entity
@Table(name="journey")
public class journey {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="jourid ")
int jourid ;
@Column(name="trainno")
int trainno;
@Column(name="datetime")
int datetime;
@Column(name="sleeper_availability")
int sleeper_availability;
@Column(name="seater_availability")
int seater_availability;
@Column(name="WL_of_sleeper")
int WL_of_sleeper;
@Column(name="WL_of_seater")
int WL_of_seater;
public int getJourid() {
	return jourid;
}
public void setJourid(int jourid) {
	this.jourid = jourid;
}
public int getTrainno() {
	return trainno;
}
public void setTrainno(int trainno) {
	this.trainno = trainno;
}
public int getDatetime() {
	return datetime;
}
public void setDatetime(int datetime) {
	this.datetime = datetime;
}
public int getSleeper_availability() {
	return sleeper_availability;
}
public void setSleeper_availability(int sleeper_availability) {
	this.sleeper_availability = sleeper_availability;
}
public int getSeater_availability() {
	return seater_availability;
}
public void setSeater_availability(int seater_availability) {
	this.seater_availability = seater_availability;
}
public int getWL_of_sleeper() {
	return WL_of_sleeper;
}
public void setWL_of_sleeper(int wL_of_sleeper) {
	WL_of_sleeper = wL_of_sleeper;
}
public int getWL_of_seater() {
	return WL_of_seater;
}
public void setWL_of_seater(int wL_of_seater) {
	WL_of_seater = wL_of_seater;
}



}
