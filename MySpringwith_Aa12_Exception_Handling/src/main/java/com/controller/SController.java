package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SController {
	
	
	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR) // first try without using this // it will show the error type // it will only work when you will use resapi // it will not show in your page.
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
	
	
	// Handling Exception in our spring mvc
	// it will handle your exception 
	// without using this your will get error 500 etc.
	// try without using this ExceptionHandler method to understand
	/*
	// for handling String and int both error
	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	public String ExceptionHandler()
	{
		return "null_page";
	}
	*/
	
	// for handling String Error
	@ExceptionHandler(value = NullPointerException.class)
	public String ExceptionHandlerNull(Model m)
	{
		m.addAttribute("msg","Null Pointer Exception has occured.");
		return "null_page";
	}
	
	
	// for handling int Error
	@ExceptionHandler(value = NumberFormatException.class)
	public String ExceptionHandlerNumber(Model m)
	{
		m.addAttribute("msg","Number Format Exception has occured.");
		return "null_page";
	}
	
	// if you dont know which type of error will occur
	// in that case we will use Generic Exception
	// in short for all type of errors we can use it
	// Generic Exception
	@ExceptionHandler(value = Exception.class)
	public String ExceptionHandlerGeneric(Model m)
	{
		m.addAttribute("msg","Exception has occured.");
		 return "null_page";
	}

}
