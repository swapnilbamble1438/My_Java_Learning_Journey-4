package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Admin;
import com.model.Candidate;
import com.model.User;

public class RowMapperimplement implements RowMapper<Admin> {

	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Admin admin = new Admin();
		admin.setId(rs.getInt(1));
		admin.setName(rs.getString(2));
		admin.setPassword(rs.getString(3));
		return admin;
	}



	
}
