package com.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;

import com.dao.AdminDAO;
import com.dao.CandidateDAO;
import com.dao.UserDAO;



public class CookieController {
	
ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
	
	AdminDAO adminDao = context.getBean("adminDao",AdminDAO.class);
	CandidateDAO candidateDao = context.getBean("candidateDao",CandidateDAO.class);
	UserDAO userDao = context.getBean("userDao",UserDAO.class);

	
	
	String dest = null;
	public int check(Model m,HttpServletRequest request,HttpServletResponse response) 
	{
		int f = 0;
	Cookie[] cookies = request.getCookies();
	for(int i = 0; i < cookies.length; i++) 
	{
		if (!cookies[i].getName().equals("c")) 
		{
			m.addAttribute("msg","Try Login to enter the page.");
			
			f = 1;
		} 		
	
	}
		return f;
	}

	
}
	
	


