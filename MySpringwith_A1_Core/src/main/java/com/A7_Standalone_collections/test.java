package com.A7_Standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/A7_Standalone_collections/config.xml");
		
	Person p = context.getBean("person1",Person.class);
	
	System.out.println(p);
	
	System.out.println("=========================================");
	
	System.out.println(p.getFriends());
	System.out.println(p.getFriends().getClass().getName());
	
	System.out.println("=======================================");
	
	System.out.println(p.getFeestructure());
	System.out.println(p.getFeestructure().getClass().getName());

	System.out.println("=========================================");
	
	System.out.println(p.getProperties());
	System.out.println(p.getProperties().getClass().getName());
	
	
	}

}
