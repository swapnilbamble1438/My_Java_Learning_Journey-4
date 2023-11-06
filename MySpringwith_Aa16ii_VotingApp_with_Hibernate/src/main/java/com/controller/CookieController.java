package com.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;



public class CookieController {
	
	
	
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
	
	


