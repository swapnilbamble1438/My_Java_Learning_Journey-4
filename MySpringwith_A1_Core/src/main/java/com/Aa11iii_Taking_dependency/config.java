package com.Aa11iii_Taking_dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

	@Bean
	public Samosa getSamosa()
	{
		
		return new Samosa();
	}
	
	
	
	
	@Bean(name = {"getStudent","student","temp","conf"})
	public Student getStudent() {

		// creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
	
}
