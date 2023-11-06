package com.Aa11ii_Removing_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		Student s = context.getBean("getStudent",Student.class);
		System.out.println(s);
		s.study();
		
		
	}
}
