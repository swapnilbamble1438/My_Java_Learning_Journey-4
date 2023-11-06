package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.AdminDAO;
import com.dao.CandidateDAO;
import com.dao.UserDAO;

@Controller
public class MainController {
	
ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
	
	AdminDAO adminDao = context.getBean("adminDao",AdminDAO.class);
	CandidateDAO candidateDao = context.getBean("candidateDao",CandidateDAO.class);
	UserDAO userDao = context.getBean("userDao",UserDAO.class);

	

	@RequestMapping("/")
	public String home(Model m)
	{
		
		m.addAttribute("title","Home");
		return "home";
	}
	
	
}
