

package com.A9_Bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A9_Bean_scope/config.xml");
		
		// so after using prototype we get different hashcode
		
		 Student student = context.getBean("ob2", Student.class);
		 System.out.println(student.hashCode());
		 
		Student student2 = context.getBean("ob2",Student.class);
		 System.out.println(student2.hashCode());
		 
		 System.out.println("------------------------------------------------------");

		 Teacher t1 = context.getBean("teacher",Teacher.class);
		 Teacher t2 = context.getBean("teacher",Teacher.class);
	
		 System.out.println(t1.hashCode());
		 System.out.println(t2.hashCode());
	
	}
	
}
