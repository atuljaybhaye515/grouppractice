package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentLogin {
	
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int LId;
private String uName;
private String password;
public int getLId() {
	return LId;
}
public void setLId(int lId) {
	LId = lId;
}
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

	
	

}
