package com.example.railwayreservation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookings")
public class bookings {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
@Column(name="pnrid")
int pnrid;
@Column(name="jourid")
int jourid;
@Column(name="contactno")
int contactno;
@Column(name="email")
String  email;
@Column(name="noofseats")
String noofseats;
@Column(name="source")
String source;
@Column(name="destination")
String destination;
@Column(name="classtype")
String classtype;
public int getPnrid() {
	return pnrid;
}
public void setPnrid(int pnrid) {
	this.pnrid = pnrid;
}
public int getJourid() {
	return jourid;
}
public void setJourid(int jourid) {
	this.jourid = jourid;
}
public int getContactno() {
	return contactno;
}
public void setContactno(int contactno) {
	this.contactno = contactno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNoofseats() {
	return noofseats;
}
public void setNoofseats(String noofseats) {
	this.noofseats = noofseats;
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
public String getClasstype() {
	return classtype;
}
public void setClasstype(String classtype) {
	this.classtype = classtype;
}


}

