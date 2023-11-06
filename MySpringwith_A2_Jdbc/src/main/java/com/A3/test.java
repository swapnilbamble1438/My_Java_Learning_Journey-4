package com.A3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A3/config.xml");
		
		StudentDAO sti = context.getBean("studimp",StudentDAO.class);
		Student student = new Student();
		
		/*
		// insert
		student.setId(5);
		student.setName("Jeevan");
		student.setCity("Mulund");
		
		int result = sti.insert(student);
		
			System.out.println("Student added " + result);
		*/
		
		/*
		 // update
		student.setId(5);
		student.setName("Raj");
		student.setCity("Nahur");
		int result = sti.update(student);
		System.out.println("Student updated " + result);
		*/
		
		
		/*
		// delete
		int result = sti.delete(5);
		System.out.println("Student deleted " + result);
		*/
		
		
		
	}

}
