package com.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path= "/index", method = RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model)
	{
		
		System.out.println("This is home url.");
		model.addAttribute("name","Swapnil Bamble");
		model.addAttribute("id",1);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Pratik");
		friends.add("Yash");
		friends.add("Raj");
		friends.add("Jay");
		
		model.addAttribute("friends",friends);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about url.");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help page.");
		
		ModelAndView modelnview = new ModelAndView();
		modelnview.addObject("name","Swapnil");
		modelnview.addObject("rollnumber",1234);
		LocalDateTime now = LocalDateTime.now();
		modelnview.addObject("time",now);
		modelnview.setViewName("help");
		return modelnview;
	}

	@RequestMapping("/detail")
	public ModelAndView detail()
	{
		ModelAndView mnv = new ModelAndView();
		mnv.addObject("name","Swapnil");
		mnv.addObject("rollnumber",1234);
		LocalDateTime now = LocalDateTime.now();
		mnv.addObject("time",now);
		mnv.setViewName("detail");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		mnv.addObject("numbers",list);
		return mnv;
	}
	
	
	
	
}
