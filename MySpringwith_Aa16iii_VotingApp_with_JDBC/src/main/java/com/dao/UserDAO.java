package com.dao;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.model.User;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class UserDAO {


	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	// insert new user
	
	public int insertuser(User user)
	{
String query=  "insert into User(name,password,email,phoneno) values(?,?,?,?)";
		
		int result = this.jdbcTemplate.update(query,user.getName(),user.getPassword(),user.getEmail(),user.getPassword());
		
		
		return result;
		
	}
	
	
	// get all users
	public List<User> getusers()
	{
		String query = "select * from User";
		RowMapper<User> rowMapper = new RowMapperimplement3();
		List<User> user = this.jdbcTemplate.query(query,rowMapper);
		
		return user;
	}
	
	// get single user
	public User getuser(int id)
	{
		
		String query = "select * from User where id = ?";
		RowMapper<User> rowMapper = new RowMapperimplement3();
		User user = this.jdbcTemplate.queryForObject(query,rowMapper , id);
		
		return user;
	}
	
	// get single user by name
		public User getuserbyname(String name)
		{
			String query = "select * from User where name = ?";
			RowMapper<User> rowMapper = new RowMapperimplement3();
			User user = this.jdbcTemplate.queryForObject(query,rowMapper , name);
			
			return user;
		}

	
	
	
	// delete the single user
	
	public int deleteUser(int id)
	{
	String query=  "delete from User where id = ?";
		
		int result = this.jdbcTemplate.update(query,id);
	
		return result;
	}
	
	
	// update user

	public int updateUser(User user)
	{
String query=  "update User set name=?,password=?,email=?,phoneno=? where id = ?";
		
		int result = this.jdbcTemplate.update(query,user.getName(),user.getPassword(),user.getEmail(),user.getPhoneno(),user.getId());
	
		return result;
	}
	
	
}
