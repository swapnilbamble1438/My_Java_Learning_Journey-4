package com.A3_Application;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class Student2DAO {

	private HibernateTemplate hibernateTemplate;

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	


	// insert student
	@Transactional
	public int insert(Student2 student)
	{
		Integer i = 0;
		if(i < (Integer)this.hibernateTemplate.save(student))
			i=1;
		System.out.println("i: " +i);
		return i;
	}
	
	// get the single data
	public Student2 getStudent(int studentId)
	{

		Student2 student = new Student2();
		student = this.hibernateTemplate.get(Student2.class,studentId);
		
		return student;
	 
		
	}
	
	// get all data
	public List<Student2> getAllStudent()
	{
		List<Student2> students = this.hibernateTemplate.loadAll(Student2.class);
		return students;
	}
	
	// delete data
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student2 stob = new Student2();
	stob = this.hibernateTemplate.get(Student2.class,studentId);
		this.hibernateTemplate.delete(stob);
		
	}
	
	// update data
	@Transactional
	public void updateStudent(Student2 student)
	{
		
		this.hibernateTemplate.update(student);
		
	}
	
	
	
}
