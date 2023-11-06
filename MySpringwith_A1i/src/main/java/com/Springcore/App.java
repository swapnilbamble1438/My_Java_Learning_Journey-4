package com.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
       
       CollegeStudent cstud1 = (CollegeStudent) context.getBean("CollegeStudent1"); 
       CollegeStudent cstud2 = (CollegeStudent) context.getBean("CollegeStudent2");       
       
       System.out.println(cstud1);
       System.out.println(cstud2);
       
        
        
    }
}
