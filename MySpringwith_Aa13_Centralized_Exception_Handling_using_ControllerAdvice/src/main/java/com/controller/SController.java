package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SController {
	
	
	
	@RequestMapping("/home")
	public String getHome()
	{
		System.out.println("Going to home view from getHome method...");
		String str = null;				  // str is null therefore its length will also be not able to view
		System.out.println(str.length()); // so here error will occur and our Exception method will handle it
		return "home";
	}
	
	@RequestMapping("/home/{name}")
	public String getHome2(@PathVariable("name") String name)
	{
		System.out.println("Going to home view from getHome2 method..."); // if we pass any String with letter and not numbers in name which is the path variable
		System.out.println("name: " + name);   // so the name variable will not convert into integer 
		Integer.parseInt(name); // so here error will occur and our Exception method will handle it
		return "home";
	}
	

}
