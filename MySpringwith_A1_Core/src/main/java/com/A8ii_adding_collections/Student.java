package com.A8ii_adding_collections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
// you can also use only @Component but u also have to write "student" in test file in place of "ob".
public class Student {
	
	@Value("Swapnil Bamble")	
	private String studentName;
	@Value("Mumbra")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	
	public Student() {
		
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}

	
	
	
	

}
