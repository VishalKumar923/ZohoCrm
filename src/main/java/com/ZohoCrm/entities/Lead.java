package com.ZohoCrm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name = "first_name", nullable=false,length=50)
private String firstName;
	@Column(name = "last_name", nullable=false,length=120)
private String lastName;
	@Column(name = "email", nullable=false,length=500,unique=true)
private String email;
	@Column(name = "mobile", nullable=false,length=10,unique = true)
private long mobile;
private String source;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}

}
