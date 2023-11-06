package com.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String args[])
	{
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("NewFile.xml");
		ManageTuition t1 = (ManageTuition)ac.getBean("t1");
		
		
		//============inserting data=================================		
		
		 //	 t1.AddTuition("Swapnil",15,"A");
			
			Tuition ta = new Tuition();
			
		//	 ta.setName("Yash");
		//	 ta.setStandard(15);
		//	 ta.setDivision("A");
		//	 t1.AddTuition(ta);
			
	//==================updating data============================			
				//		 ta.setName("Pratik");
				//		 ta.setStandard(5);
				//		 ta.setDivision("B");
				//		 t1.UpdateTuition(ta);
						
	//===================deleting data=============================
						
					//	ta.setName("Yash");
					//	t1.DeleteTuition(ta);
			
	//================viewing data======================		
			List<Tuition> lt = t1.ListTuition();
			
			for(Tuition tlist : lt) {
				System.out.print("ID : " + tlist.getName());
				System.out.print(", Name : " + tlist.getStandard());
				System.out.print(", Salary : " + tlist.getDivision());
				System.out.println("");
				

				
			}	
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
