package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Admin;
import com.model.Candidate;
import com.model.User;

public class RowMapperimplement2 implements RowMapper<Candidate> {



public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Candidate candidate = new Candidate();
		candidate.setId(rs.getInt(1));
		candidate.setCandidate1(rs.getString(2));
		candidate.setCandidate2(rs.getString(3));
		candidate.setCandidate3(rs.getString(4));
		candidate.setCandidate4(rs.getString(5));
		return candidate;
	}


	
}
