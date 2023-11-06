package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.model.Student;

public class StudentDAO {

	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public Boolean save(final Student s)
	{
		String str = "insert into Student values(?,?,?,?)";
		
		return jdbc.execute(str,new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			
				ps.setInt(1, s.getRoll());
				ps.setString(2, s.getName());
				ps.setString(3, s.getEmail());
				ps.setString(4, s.getMobile());
				
				return ps.execute();
			}
			
		});
	}
	
	
}
