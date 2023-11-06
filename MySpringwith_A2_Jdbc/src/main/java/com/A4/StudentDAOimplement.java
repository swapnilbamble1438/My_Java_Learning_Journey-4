package com.A4;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class StudentDAOimplement implements StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Student student) {
		String query=  "insert into student(id,name,city) values(?,?,?)";
		
		int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		
		return result;
	}
	
	public int update(Student student) {
		
		String query=  "update student set id=?,name=?,city=? where id = 5";
		
		int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	
		return result;
	}

	public int delete(int studentId) {
		
		String query=  "delete from student where id = ?";
		
		int result = this.jdbcTemplate.update(query,studentId);
	
		return result;
	}

	
	public Student getStudent(int studentId) {
		
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperimplement();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper , studentId);
		
		return student;
	}

	public List<Student> getAllStudents() {
		

		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperimplement();
		List<Student> students = this.jdbcTemplate.query(query,rowMapper);
		
		return students;
		
	}
	
	

}
