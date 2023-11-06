package com.A5_Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/A5_Lifecycle/config.xml");
		
		Samosa s = (Samosa) context.getBean("s1");
		System.out.println(s);
		
		context.registerShutdownHook(); // for destroying method
				
		
		
		
		
		
	}
	
	
	
}
