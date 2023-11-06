package com.entity;

import java.util.List;

public class Stud2 {

	private String name;
	private Long id;
	private String date;
	private List<String> courses;
	private String gender;
	private String type;
	
	private Address address;
	
	public Stud2() {	
	
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Stud2 [name=" + name + ", id=" + id + ", date=" + date + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}
	
	
}
