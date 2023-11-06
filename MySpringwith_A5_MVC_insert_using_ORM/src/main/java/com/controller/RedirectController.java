package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	// first method
	/*
	@RequestMapping("/one")
	public String one()
	{
		System.out.println("this is one handler");
		return "redirect:/two";
	}
	*/
	
	// second method
	@RequestMapping("/one")
	public RedirectView one2()
	{
		System.out.println("this is one2 handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
		
	}
	
	
	
	@RequestMapping("/two")
	public String two()
	{
		
		System.out.println("this is two handler");
		return "two";
	}
	

	
}
