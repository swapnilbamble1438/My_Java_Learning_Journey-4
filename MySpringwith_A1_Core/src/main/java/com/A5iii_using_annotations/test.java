package com.A5iii_using_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/A5iii_using_annotations/config.xml");
		
	
		Example e = (Example) context.getBean("example");
		System.out.println(e);
		
		context.registerShutdownHook();
		
	}
	
	
	
}
