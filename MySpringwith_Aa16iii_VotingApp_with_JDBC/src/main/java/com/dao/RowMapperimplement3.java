package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.User;



public class RowMapperimplement3 implements RowMapper<User> {


	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setEmail(rs.getString(4));
		user.setPhoneno(rs.getString(5));
		return user;
	}

	
}
