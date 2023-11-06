package com.dao;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Component
public class UserDAO {

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	// insert new user
	@Transactional
	public int insertuser(User user)
	{
		int i = (Integer)this.hibernateTemplate.save(user);
		
		if(i>0)	
		i = 1;
		
		return i;
		
	}
	
	
	// get all users
	public List<User> getusers()
	{
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		
		return users;
	}
	
	// get single user
	public User getuser(int id)
	{
		
		User user =  this.hibernateTemplate.get(User.class,id);
		return user;
	}
	
	// get single user by name
	@Query("select u From User u WHERE u.name =:n")
		public User getuser(@Param("n")String name)
		{
			
			User user =   this.hibernateTemplate.get(User.class,name);
			return user;
		}

	
	
	
	// delete the single user
	@Transactional
	public void deleteUser(int id)
	{
	User user = this.hibernateTemplate.load(User.class, id);
	this.hibernateTemplate.delete(user);
	}
	
	
	// update user
	@Transactional
	public void updateUser(User user)
	{
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	
}
