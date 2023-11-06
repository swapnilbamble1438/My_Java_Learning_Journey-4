package com.A3;

import org.springframework.jdbc.core.JdbcTemplate;


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

	
	

}
