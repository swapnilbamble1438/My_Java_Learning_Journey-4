package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hcontroller {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("going to home view...");
		return "home";
	}
	
	
}
