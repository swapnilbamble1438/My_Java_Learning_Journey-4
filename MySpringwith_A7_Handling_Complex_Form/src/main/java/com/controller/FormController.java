package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Stud;
import com.entity.Stud2;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String showForm()
	{
		
		return "form";
	}
	
	//handling form
	
	@RequestMapping(path="/handleform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("stud") Stud stud)
	{
		System.out.println(stud);
		return "success";
	}
	
	
	@RequestMapping("/form2")
	public String showForm2()
	{
		
		return "form2";
	}
	
	
	//handling form2
	
		@RequestMapping(path="/handleform2", method = RequestMethod.POST)
		public String formHandler2(@ModelAttribute("stud2") Stud2 stud2)
		{
			System.out.println(stud2);
			return "success";
		}
		
		
	
}
