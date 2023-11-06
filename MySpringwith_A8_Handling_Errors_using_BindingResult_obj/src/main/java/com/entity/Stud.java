package com.entity;

import java.util.Date;
import java.util.List;

public class Stud {
	
	private String name;
	private Long id;
	private String date;
	private List<String> courses;
	private String gender;
	private String type;
	
	public Stud() {
		
	}

	public String getName() {
		return name;
	}
		

	public Stud(String name, Long id, String date, List<String> courses, String gender, String type) {
	
		this.name = name;
		this.id = id;
		this.date = date;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
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

	@Override
	public String toString() {
		return "Stud [name=" + name + ", id=" + id + ", date=" + date + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + "]";
	}
	
	
	

}
