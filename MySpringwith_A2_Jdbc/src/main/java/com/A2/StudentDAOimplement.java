package com.A2;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOimplement implements StudentDAO{
	
	private  JdbcTemplate jdbcTemplate;

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
	

}
