package com.A1_Springcore;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("com/A1_Springcore/config.xml");
      
       
       // getting data from bean 1 and printing it
       Friend friend1 = (Friend) context.getBean("friend1");
       System.out.println(friend1);
       
       // getting data from bean 2 and printing it
       Friend friend2 = (Friend) context.getBean("friend2");
       System.out.println(friend2);
       
       // getting data from bean 3 and printing it
       Friend friend3 = (Friend) context.getBean("friend3");
       System.out.println(friend3);
    
    }
}
