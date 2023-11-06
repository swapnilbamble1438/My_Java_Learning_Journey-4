package com.A4ii_Ambiquity_problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A4ii_Ambiquity_problem/config.xml");
		
		
		Addition a = (Addition) context.getBean("add");
		a.doSum();
		
		
	}
	
	
	
}

