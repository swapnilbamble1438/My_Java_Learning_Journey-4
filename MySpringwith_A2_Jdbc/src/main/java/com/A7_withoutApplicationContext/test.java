package com.A7_withoutApplicationContext;

import java.util.List;



public class test {

	
	public static void main(String[] args) {
		
		config template = new config(); 
				
		StudentDAOimplement sti = new StudentDAOimplement(template.getTemplate());
		/*
		// insert
		Student student = new Student();
		student.setId(5);
		student.setName("Jeevan");
		student.setCity("Mulund");
		
		int result = sti.insert(student);
		
			System.out.println("Student added " + result);
		*/
		
		/*
		 // update
		Student student = new Student();
		student.setId(5);
		student.setName("Raj");
		student.setCity("Nahur");
		int result = sti.update(student);
		System.out.println("Student updated " + result);
		*/
		
		
		/*
		// delete
		Student student = new Student();
		int result = sti.delete(5);
		System.out.println("Student deleted " + result);
		*/
		
		/*
		//select(view) single data
		Student student = sti.getStudent(4);
		System.out.println(student);
		
		*/
		
		//view all data
		List<Student> students = sti.getAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}
		
	}

}
