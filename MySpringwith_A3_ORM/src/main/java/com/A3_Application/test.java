package com.A3_Application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A3_Application/config.xml");
		Student2DAO studentDao = context.getBean("studentDao", Student2DAO.class);
	
		
	

		//updata data
//		Student2 student = new Student2();
//		student = studentDao.getStudent(2);
//		student.setStudentName("Pratik");
//		studentDao.updateStudent(student);
//		System.out.println("Updated.");
		
		
		Scanner sc = new Scanner(System.in);
	//	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		
		while(go) {
		System.out.println("Press 1 for add new student");
		System.out.println("Press 2 for get detail of single student");
		System.out.println("Press 3 for display all students");
		System.out.println("Press 4 for delete students");
		System.out.println("Press 5 for update student");
		System.out.println("Press 6 for exit");
		
		try {
			
			int input = sc.nextInt();
		//  int input = Integer.parseInt(br.readLine());
			switch(input)
			{
			case 1:
				// add new student
				
				System.out.println("Enter student id:");
				int uid = sc.nextInt();
				System.out.println("Enter student name:");
				String sname = sc.next();
				System.out.println("Enter student city");
				String scity = sc.next();
				
			//	Student2 student = new Student2(uid,sname,scity);	
				Student2 student = new Student2();
				student.setStudentId(uid);
				student.setStudentName(sname);
				student.setStudentCity(scity);
				
				int r = studentDao.insert(student);
				System.out.println(r +" new student added successfully.");
				System.out.println("---------------------------------------------------");
				System.out.println();
				break;
			case 2:
				// get single student data
				
				System.out.println("Enter student id:");
				int userid = sc.nextInt();
				
				Student2 stud = studentDao.getStudent(userid);
				System.out.print("Id: " + stud.getStudentId()+ " ");
				System.out.print("Name: " + stud.getStudentName()+ " ");
				System.out.println("City: " + stud.getStudentCity()+ " ");
			
			System.out.println("---------------------------------------------------");
			System.out.println();
			
			
				break;
			case 3:
				
				// display all students
				
				List<Student2> stl =	studentDao.getAllStudent();
				for(Student2 s : stl)
				{
					System.out.print("Id: " + s.getStudentId()+ " ");
					System.out.print("Name: " + s.getStudentName()+ " ");
					System.out.println("City: " + s.getStudentCity()+ " ");
				}
				System.out.println("---------------------------------------------------");
				System.out.println();
				break;
			case 4:
				// delete student
				
				System.out.println("Enter student id:");
				int usrid = sc.nextInt();
				
				studentDao.deleteStudent(usrid);	
				System.out.println("Deleted Successfully. ");
				
				System.out.println("---------------------------------------------------");
				System.out.println();
				
				break;
			case 5:
				// update student
				
				System.out.println("Enter student id:");
				int sid = sc.nextInt();
				System.out.println("Set student id:");
				int stid = sc.nextInt();
				System.out.println("Set student name:");
				String stname = sc.next();
				System.out.println("Set student city");
				String stcity = sc.next();
				
				Student2 stu = new Student2();
				stu = studentDao.getStudent(sid);
				stu.setStudentId(stid);
				stu.setStudentName(stname);
				stu.setStudentCity(stcity);
				studentDao.updateStudent(stu);
				System.out.println("Updated Successfully.");
				

				System.out.println("---------------------------------------------------");
				System.out.println();
				
				break;
			case 6:
				// exit
				go=false;
				break;
				
				
			}
			
			
			
		}catch(Exception e) {
			System.out.println("Invalid Input try with another one !");
		}
		
		}
		
		System.out.println("Thankyou using my application");
		System.out.println("See you soon !");
		
		
		
		
		
	}
}
