package com.A5ii_without_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/A5ii_without_using_xml/config.xml");
		
		
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		context.registerShutdownHook();
		
		
		
	}
	
	
	
}
