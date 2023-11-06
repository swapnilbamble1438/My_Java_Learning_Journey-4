package com.A4_Constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A4_Constructor_injection/config.xml");
		
		Person p = (Person) context.getBean("p1");
		System.out.println(p);
		
		
		
		
	}
	
	
	
}

