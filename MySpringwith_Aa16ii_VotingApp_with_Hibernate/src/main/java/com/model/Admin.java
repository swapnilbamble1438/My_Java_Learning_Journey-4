package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String password;

public Admin() {
	
}

public Admin(int id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "admin [id=" + id + ", name=" + name + ", password=" + password + "]";
}








}