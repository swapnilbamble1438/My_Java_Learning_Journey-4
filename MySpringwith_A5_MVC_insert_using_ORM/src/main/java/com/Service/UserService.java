package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public int createUser(User user)
	{
	return this.userDAO.saveUser(user);
	}
}
