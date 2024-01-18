package com.ajit.CURDOperations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
private Integer rollNo;
private String firstName;
private String lastName;
private Integer std;
public Integer getRollNo() {
	return rollNo;
}
public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Integer getStd() {
	return std;
}
public void setStd(Integer std) {
	this.std = std;
}

}
