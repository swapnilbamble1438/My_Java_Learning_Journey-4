package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;


import com.model.Admin;


public class AdminDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	// insert new admin

	public int insertadmin(Admin admin)
	{
String query=  "insert into Admin(name,password) values(?,?)";
		
		int result = this.jdbcTemplate.update(query,admin.getName(),admin.getPassword());
		
		
		return result;
	}
	
	
	// get all admin
	public List<Admin> getadmins()
	{
		String query = "select * from Admin";
		RowMapper<Admin> rowMapper = new RowMapperimplement();
		List<Admin> admin = this.jdbcTemplate.query(query,rowMapper);
		
		return admin;
	}
	
	// get single admin
	public Admin getadmin(int id)
	{
		String query = "select * from Admin where id = ?";
		RowMapper<Admin> rowMapper = new RowMapperimplement();
		Admin admin = this.jdbcTemplate.queryForObject(query,rowMapper , id);
		
		return admin;
	}
	

	
	
	
	// delete the single admin
	
	public int deleteadmin(int id)
	{
		String query=  "delete from Admin where id = ?";
		
		int result = this.jdbcTemplate.update(query,id);
	
		return result;
		
	}
	
	
	// update admin

	public int updateadmin(Admin admin)
	{
String query=  "update Admin set name=?,password=? where id = ?";
		
		int result = this.jdbcTemplate.update(query,admin.getName(),admin.getPassword(),admin.getId());
	
		return result;
	}
	

}
