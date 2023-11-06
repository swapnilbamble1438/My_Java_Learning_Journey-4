package com.Aa11ii_Removing_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

	@Bean
	public Student getStudent() {
		
		// creating a new student object
		Student student = new Student();
		return student;
	}
	
}
