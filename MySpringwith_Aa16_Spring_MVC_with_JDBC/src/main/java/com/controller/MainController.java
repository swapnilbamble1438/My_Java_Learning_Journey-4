package com.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.StudentDAO;
import com.model.Student;

@Controller
public class MainController {

	ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
		
	
			
	StudentDAO studentDao = context.getBean("studentDao",StudentDAO.class);
	
	@RequestMapping("/")
	public String view1()
	{
		return "home";
	}
	
	@RequestMapping("/register")
	public String view2(Model m)
	{
		Student student = context.getBean("student",Student.class);
		m.addAttribute("student",student);
		return "register";
	}
	
	@RequestMapping("/store")
	public String view3(@ModelAttribute("student") Student student,Model m)
	{
		studentDao.save(student);
		m.addAttribute("msg","Record insert successfully...");
		return "register";
	}
}
