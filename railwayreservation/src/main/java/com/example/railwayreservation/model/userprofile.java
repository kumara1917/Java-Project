package com.example.railwayreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userprofile")
public class userprofile {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="irctcid")
int irctcid ;
@Column(name="name")
String name ;
@Column(name="email")
String email ;
@Column(name="password")
String password;
public int getIrctcid() {
	return irctcid;
}
public void setIrctcid(int irctcid) {
	this.irctcid = irctcid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
