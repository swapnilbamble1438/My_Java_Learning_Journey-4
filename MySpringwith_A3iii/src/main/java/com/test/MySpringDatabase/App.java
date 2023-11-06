package com.test.MySpringDatabase;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.MySpringDatabase.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("NewFile.xml");
    	ManageEmployee m1=(ManageEmployee)ac.getBean("me1");
//    	m1.AddEmployee(127, "asdfasf", 234234);
     	Employee e1=new Employee();
//    	e1.setEid(102);
//    	e1.setEname("dhillon");
//    	e1.setEsalary(124536);
//    	m1.AddEmployee(e1);
     	
     	
	 List<Employee> em1 = m1.listEmployee();
   	 
   	 for (Employee record : em1) {
   	 System.out.print("ID : " + record.getEid() );
   	 System.out.print(", Name : " + record.getEname() );
   	 System.out.println(", Salary : " + record.getEsalary());
   	 }
    }
}
