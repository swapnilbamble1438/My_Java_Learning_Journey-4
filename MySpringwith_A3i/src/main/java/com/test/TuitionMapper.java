package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TuitionMapper implements RowMapper<Tuition>{
	
	public Tuition mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		Tuition mt = new Tuition();
		mt.setName(rs.getString("Name"));
		mt.setStandard(rs.getInt("Standard"));
		mt.setDivision(rs.getString("Division"));
		
		return mt;
	}

	
}
