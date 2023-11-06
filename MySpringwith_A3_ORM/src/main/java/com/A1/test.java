package com.A1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A1/config.xml");
		Student2DAO studentDao = context.getBean("studentDao", Student2DAO.class);
		
		Student2 student = new Student2(2,"Yash","Thane");
		
		int r = studentDao.insert(student);
		System.out.println("Done: " + r);
	}
}
