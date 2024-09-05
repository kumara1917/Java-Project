package com.example.railwayreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="passenger")
	public class passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="passengerid")
	int passengerid;
	@Column(name="name")
	String name;
	@Column(name="aadharnumber")
	int aadharnumber;
	@Column(name="age")
	int age;
	@Column(name="gender")
	String gender;
	@Column(name="seatpreference")
	String seatpreference;
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(int aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSeatpreference() {
		return seatpreference;
	}
	public void setSeatpreference(String seatpreference) {
		this.seatpreference = seatpreference;
	}

}
