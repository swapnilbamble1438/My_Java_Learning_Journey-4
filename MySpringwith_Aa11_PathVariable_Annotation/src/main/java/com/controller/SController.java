package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class SController {

	// first try this it will show output only in console
	/*
	@RequestMapping("/home/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println("userId: "+userId + " and userName: " + userName);
		return "home";
	}
	*/
	
	
	// second try this it will show output in home.jsp
	
	@RequestMapping("/home/{userId}/{userName}")
	public String getUserDetail2(@PathVariable("userId") int userId,@PathVariable("userName") String userName,Model model)
	{
		
		System.out.println("userId: "+userId + " and userName: " + userName);
		model.addAttribute("id","userId");
		model.addAttribute("name","userName");
		
		return "home";
	}
	
}
