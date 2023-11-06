package com.A7_withoutApplicationContext;

import java.util.List;


public interface StudentDAO {
	
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(int studentId);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();


}
