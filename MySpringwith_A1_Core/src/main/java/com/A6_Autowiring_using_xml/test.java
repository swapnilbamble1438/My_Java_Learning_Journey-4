package com.A6_Autowiring_using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A6_Autowiring_using_xml/config.xml");
		
	//	Emp e = (Emp) context.getBean("emp1");
		
		Emp e = context.getBean("emp1",Emp.class);
		
		System.out.println(e);
		
		
	}
}
