package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Admin;
import com.model.Candidate;
import com.model.User;



public class CandidateDAO {
	

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	// insert new candidate
	
	public int insertcandidate(Candidate candidate)
	{
String query=  "insert into Candidate(candidate1,candidate2,candidate3,candidate4) values(?,?,?,?)";
		
		int result = this.jdbcTemplate.update(query,candidate.getCandidate1(),candidate.getCandidate2(),candidate.getCandidate3(),candidate.getCandidate4());
		
		
		return result;
		
	}
	
	
	// get all candidates
	public List<Candidate> getcandidates()
	{
		String query = "select * from Candidate";
	RowMapper<Candidate> rowMapper = new RowMapperimplement2();
	List<Candidate> candidate = this.jdbcTemplate.query(query,rowMapper);
	
	return candidate;
	}
	
	// get single candidate
	public Candidate getcandidate(int id)
	{
		String query = "select * from Candidate where id = ?";
		RowMapper<Candidate> rowMapper = new RowMapperimplement2();
		Candidate candidate = this.jdbcTemplate.queryForObject(query,rowMapper , id);
		
		return candidate;
		
	}
	

	
	
	
	// delete the single candidate

	public int deletecandidate(int id)
	{
String query=  "delete from Candidate where id = ?";
		
		int result = this.jdbcTemplate.update(query,id);
	
		return result;
	}
	
	
	// update candidate
	
	public int updatecandidate(Candidate candidate)
	{
String query=  "update Candidate set candidate1=?,candidate2=?,candidate3=?,candidate4=? where id = ?";
		
		int result = this.jdbcTemplate.update(query,candidate.getCandidate1(),candidate.getCandidate2(),candidate.getCandidate3(),candidate.getCandidate4(),candidate.getId());
	
		return result;
	}
	

}
