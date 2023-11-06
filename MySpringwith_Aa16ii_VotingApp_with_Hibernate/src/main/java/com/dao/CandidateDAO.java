package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Candidate;
import com.model.User;


@Component
public class CandidateDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	

	// insert new candidate
	@Transactional
	public int insertcandidate(Candidate candidate)
	{
		int i = (Integer)this.hibernateTemplate.save(candidate);
		
		if(i>0)	
		i = 1;
		
		return i;
		
	}
	
	
	// get all candidates
	public List<Candidate> getcandidates()
	{
		List<Candidate> candidates = this.hibernateTemplate.loadAll(Candidate.class);
		
		return candidates;
	}
	
	// get single candidate
	public Candidate getcandidate(int id)
	{
		
		Candidate candidate =  this.hibernateTemplate.get(Candidate.class,id);
		return candidate;
	}
	

	
	
	
	// delete the single candidate
	@Transactional
	public void deletecandidate(int id)
	{
	Candidate candidate = this.hibernateTemplate.load(Candidate.class, id);
	this.hibernateTemplate.delete(candidate);
	}
	
	
	// update candidate
	@Transactional
	public void updatecandidate(Candidate candidate)
	{
		this.hibernateTemplate.saveOrUpdate(candidate);
	}
	

}
