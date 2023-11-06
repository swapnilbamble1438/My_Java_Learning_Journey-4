package com.A8ii_adding_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A8ii_adding_collections/config.xml");
		
		 Student student = context.getBean("ob", Student.class);
		 System.out.println(student);
		 
		 System.out.println(student.getAddress());
		 System.out.println(student.getAddress().getClass().getName());

		 System.out.println("------------------------------------------------------");
		 
		 System.out.println(student.hashCode());
		 
		Student student2 = context.getBean("ob",Student.class);
		 System.out.println(student2.hashCode());
		 
		 // so here after creating two object student and student2 we are getting same hashcode
		 // that means we are getting same object
		 // so we will discuss it in next package 
		 // about Bean scope
	}
}
