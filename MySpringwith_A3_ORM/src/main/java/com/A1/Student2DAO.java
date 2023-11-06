package com.A1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class Student2DAO {

	private HibernateTemplate hibernateTemplate;

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	


	// insert student
	@Transactional

	public int insert(Student2 student)
	{
		Integer i = (Integer)this.hibernateTemplate.save(student);
		
		return i;
	}
	
	
	
	
	
}
