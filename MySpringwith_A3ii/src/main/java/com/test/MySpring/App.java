package com.test.MySpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("NewFile.xml");
		ManageMember m1 = (ManageMember)ac.getBean("me1");
		
//============inserting data=================================		
		
	 //	 m1.AddMember(5,"Deepak",50);
		
		Member e1 = new Member();
		
		// e1.setMid(30);
		// e1.setMname("Pratik");
		// e1.setMsalary(30);
		// m1.AddMember(e1);
		
//==================updating data============================			
				//	 e1.setMid(3);
				//	 e1.setMname("Pratik");
				//	 e1.setMsalary(30);
				//	 m1.UpdateMember(e1);
					
//===================deleting data=============================
					
				//	e1.setMid(4);
				//	m1.DeleteMember(e1);
		
//================viewing data======================		
		List<Member> mem1 = m1.listMember();
		
		for(Member record : mem1) {
			System.out.print("ID : " + record.getMid());
			System.out.print(", Name : " + record.getMname());
			System.out.print(", Salary : " + record.getMsalary());
			System.out.println("");
			

			
			
			
		}
		
	}
}
