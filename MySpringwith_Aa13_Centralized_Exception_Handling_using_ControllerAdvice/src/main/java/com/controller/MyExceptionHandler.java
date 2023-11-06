package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String ExceptionHandlerNull(Model m)
	{
		m.addAttribute("msg","Null Pointer Exception has occured.");
		return "null_page";
	}
	

	@ExceptionHandler(value = NumberFormatException.class)
	public String ExceptionHandlerNumber(Model m)
	{
		m.addAttribute("msg","Number Format Exception has occured.");
		return "null_page";
	}

	@ExceptionHandler(value = Exception.class)
	public String ExceptionHandlerGeneric(Model m)
	{
		m.addAttribute("msg","Exception has occured.");
		 return "null_page";
	}

	
}
