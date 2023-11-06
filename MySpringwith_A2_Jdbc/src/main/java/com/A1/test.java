package com.A1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {

	public static void main(String[] args) {
		
		
		System.out.println("My program started...");
		
		//spring jdbc => JdbcTemplate object
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A1/config.xml");
	JdbcTemplate template =	context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		// insert query
	String query=  "insert into student(id,name,city) values(?,?,?)";
	
		// fire query
	int result = template.update(query,2,"Yash","Thane");
	
	System.out.println("no. of rows inserted.. " + result);
	

	
	
	
	}
}
