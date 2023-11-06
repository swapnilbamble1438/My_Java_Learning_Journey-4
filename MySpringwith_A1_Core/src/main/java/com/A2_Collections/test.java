package com.A2_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/A2_Collections/config.xml");
		
	Emp emp1 = (Emp) context.getBean("emp1");
	
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourses());
	
	
	}

}
