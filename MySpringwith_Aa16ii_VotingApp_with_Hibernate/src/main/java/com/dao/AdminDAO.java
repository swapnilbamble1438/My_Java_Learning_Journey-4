package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.model.Admin;
import com.model.User;

@Component
public class AdminDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	// insert new admin
	@Transactional
	public int insertadmin(Admin admin)
	{
		int i = (Integer)this.hibernateTemplate.save(admin);
		
		if(i>0)	
		i = 1;
		
		return i;
		
	}
	
	
	// get all admin
	public List<Admin> getadmins()
	{
		List<Admin> admins = this.hibernateTemplate.loadAll(Admin.class);
		
		return admins;
	}
	
	// get single admin
	public Admin getadmin(int id)
	{
		
		Admin admin =  this.hibernateTemplate.get(Admin.class,id);
		return admin;
	}
	

	
	
	
	// delete the single admin
	@Transactional
	public void deleteadmin(int id)
	{
	Admin admin = this.hibernateTemplate.load(Admin.class, id);
	this.hibernateTemplate.delete(admin);
	}
	
	
	// update admin
	@Transactional
	public void updateadmin(Admin admin)
	{
		this.hibernateTemplate.saveOrUpdate(admin);
	}
	

}
