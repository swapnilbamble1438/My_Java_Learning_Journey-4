package com.A2_Crud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/A2_Crud/config.xml");
		Student2DAO studentDao = context.getBean("studentDao", Student2DAO.class);
	
		
		// insert data
//		Student2 student = new Student2(3,"Pratik","Thane");	
//		int r = studentDao.insert(student);
//		System.out.println("Done: " + r);
		

		
		// delete data
//		studentDao.deleteStudent(3);	
//		System.out.println("Deleted: ");
		
	
		// view single data
//		Student2 student = studentDao.getStudent(1);
//		int id = studentDao.getStudent(1).getStudentId();	
//		int id = student.getStudentId();
//		String name = studentDao.getStudent(1).getStudentName();
//		String name = student.getStudentName();
//		String city = studentDao.getStudent(1).getStudentCity();
//		String city = student.getStudentCity();
//		System.out.println(id +" " + name+" "+ "city");
	
		
		// view all data
//		List<Student2>	stl = studentDao.getAllStudent();
//		for(Student2 s: stl)
//		{
//			System.out.println(s.getStudentId() +" "+s.getStudentName()+" "+s.getStudentCity());
//		}
	
		
		//updata data
//		Student2 student = new Student2();
//		student = studentDao.getStudent(2);
//		student.setStudentName("Pratik");
//		studentDao.updateStudent(student);
//		System.out.println("Updated.");
		
		
	}
}
