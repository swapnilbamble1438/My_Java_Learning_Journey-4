package com.A3_Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/A3_Reference/config.xml");
		
	A a1 = (A) context.getBean("aref");
	System.out.println(a1);
	System.out.println(a1.getX());
	System.out.println(a1.getOb());
	System.out.println(a1.getOb().getY());
	
	
	
	}
}
