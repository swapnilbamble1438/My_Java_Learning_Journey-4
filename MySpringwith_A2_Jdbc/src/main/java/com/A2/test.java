package com.A2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {

	public static void main(String[] args) {
		
		
		System.out.println("My program started...");
				
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A2/config.xml");
	
		StudentDAO sti = context.getBean("studimp",StudentDAO.class);
	
		Student student = new Student();
		student.setId(5);
		student.setName("Jeevan");
		student.setCity("Mulund");
		
		int result = sti.insert(student);
		
		System.out.println("Student added " + result);
	
	
	
	
	}
}
