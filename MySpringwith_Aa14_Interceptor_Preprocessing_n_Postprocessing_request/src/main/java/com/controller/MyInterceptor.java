package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class MyInterceptor implements HandlerInterceptor{
	
	
	// u can also use ( extends HandlerInterceptorAdapter )
	// instead of ( implements HandlerInterceptor )
	
	HandlerInterceptor obj = new HandlerInterceptor() {
	};
	
	
	// for adding this method just go to source 
	// and go to override/implement methods
	// first try this method
	/*
	 // prehandler method
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("This is prehandler...");
		return true;
	}
	*/
	 // prehandler method
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("This is prehandler...");
		String name= request.getParameter("user");
		if(name.startsWith("s"))
		{
			response.setContentType("text/html");
			response.getWriter().println("Invalid name ... Name Should not start with s");
			return false;
		}
		else
			return true;
	}

//====== try this after above method =======================================================================================
	
	// posthandler method
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("This is post handler...");
		
	
		
		obj.postHandle(request, response, handler, modelAndView);
	}

	// aftercompletion method
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("This is after completion method...");
		
		obj.afterCompletion(request, response, handler, ex);
	}
	
	
	
}
