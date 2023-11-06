package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.UserService;
import com.model.User;


@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	

	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("commonmsg","Enjoying learning Java Spring MVC");
	}
	

	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		m.addAttribute("Header","Learning Java Spring MVC");
		m.addAttribute("Desc", "Learning to Send and Accept values through various methods");
		return "contact";
	}
	
	// first method
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
		public String handleForm(@RequestParam("userName") String name,
		@RequestParam("userPassword") String password,
		@RequestParam("userEmail") String email, Model model)
		{
		
			System.out.println("userName: " + name);
			System.out.println("userPassword: " + password);
			System.out.println("userEmail: " + email);
			
			
			model.addAttribute("name", name);
			model.addAttribute("password", password);
			model.addAttribute("email", email);
			
			return "success";
		}
		
	// second method
	@RequestMapping(path = "/processform2",method = RequestMethod.POST)
	public String handleForm2(@RequestParam("userName") String name,
	@RequestParam("userPassword") String password,
	@RequestParam("userEmail") String email, Model model)
	{
	
	
		
		User usr = new User();
		usr.setUserName(name);
		usr.setUserPassword(password);
		usr.setUserEmail(email);
		
		System.out.println(usr);
		
		model.addAttribute("user",usr);
		
		
		return "success";
	}
	
	// third method
	@RequestMapping(path = "/processform3",method = RequestMethod.POST)
	public String handleForm3(@ModelAttribute User user,Model model)
	{
	
		System.out.println(user);
		
		model.addAttribute("Header","Learning Java Spring MVC");
		model.addAttribute("Desc", "Learning to Send and Accept values through various methods");
		
		
		model.addAttribute("user",user);
		
		if(user.getUserName().isBlank())
		{
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		return "success";
	}
	
	
	
}
