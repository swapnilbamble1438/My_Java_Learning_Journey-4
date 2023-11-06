package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


import com.dao.AdminDAO;
import com.dao.CandidateDAO;
import com.dao.UserDAO;
import com.model.Admin;
import com.model.Candidate;


@Controller
public class AdminController {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
	
	AdminDAO adminDao = context.getBean("adminDao",AdminDAO.class);
	CandidateDAO candidateDao = context.getBean("candidateDao",CandidateDAO.class);
	UserDAO userDao = context.getBean("userDao",UserDAO.class);

	
	// adminhome.jsp view all candidates votes in admin home page
	@RequestMapping("adminhome")
	public String adminhome(Model m,HttpServletRequest request,HttpServletResponse response)
	{
		String dest = "adminhome";
		
		HttpSession session = request.getSession();
		if(session.getAttribute("namea") == null)
		{
			m.addAttribute("msg","Login to enter the page.");
			dest = "adminlogin";
		}
		else {
		// view total number of votes
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		
		List<Candidate> listc = candidateDao.getcandidates();
		for(Candidate v : listc)
		{
			if(!v.getCandidate1().equals("") )
				c1= c1 + 1;
			if(!v.getCandidate2().equals("") )
				c2= c2 + 1;
			if(!v.getCandidate3().equals("") )
				c3= c3 + 1;
			if(!v.getCandidate4().equals("") )
				c4= c4 + 1;
		}
		
		m.addAttribute("c1",c1);
		m.addAttribute("c2",c2);
		m.addAttribute("c3",c3);
		m.addAttribute("c4",c4);
		
		
		
		m.addAttribute("title","Admin Home");
		}
		return dest;
	}
	
	// addadmin.jsp
				@RequestMapping("addadmin")
				public String addadmin(Model m,HttpServletRequest request,HttpServletResponse response)
				{
					String dest = "addadmin";
					
					
					
					return dest;
				}
	

	
	//handle addadmin 
	@RequestMapping(value="/handleaddadmin",method = RequestMethod.POST)
	public RedirectView handleaddadmin(@ModelAttribute Admin admin, Model m,HttpServletRequest request)
	{
		System.out.println(admin);
		adminDao.insertadmin(admin);
		RedirectView r = new RedirectView();
		m.addAttribute("msg","New Admin added successfully.");
		r.setUrl("addadmin"); // it is homepage path
		return r;
	}
	
	
	// viewadmins
			@RequestMapping("viewadmins")
			public String viewadmins(Model m,HttpServletRequest request,HttpServletResponse response)
			{
				String dest = "viewadmins";
				
				HttpSession session = request.getSession();
				if(session.getAttribute("namea") == null)
				{
					m.addAttribute("msg","Login to enter the page.");
					dest = "adminlogin";
				}
				else
				{
				List<Admin> admins = adminDao.getadmins();
				System.out.println(admins);
				m.addAttribute("admins", admins);
				m.addAttribute("title","Admins Details");
				}
				return dest;
			}
			
			
			// handle deleteadmin
			@RequestMapping("/deleteadmin/{id}")
			public RedirectView deleteadmin(@PathVariable("id") int id,HttpServletRequest request)
			{
				adminDao.deleteadmin(id);
				
				RedirectView rv = new RedirectView();
				rv.setUrl(request.getContextPath() + "/viewadmins");
				
				return rv;
			}
			
			
			// updateadmin.jsp
			@RequestMapping("/updateadmin/{id}")
			public String updateadmin(@PathVariable("id") int id,Model m,HttpServletRequest request, HttpServletResponse response)
			{
				String dest = "updateadmin";
				
				HttpSession session = request.getSession();
				if(session.getAttribute("namea") == null)
				{
					m.addAttribute("msg","Login to enter the page.");
					dest = "adminlogin";
				}
				else
				{
			Admin admin = adminDao.getadmin(id);
				m.addAttribute("admin",admin);
				m.addAttribute("title", "Edit Admin Details");
				}
				return dest;
			}
			

			// handle updateadmin
				@RequestMapping(value="/handleupdateadmin",method = RequestMethod.POST)
				public RedirectView handleupdateadmin(@ModelAttribute Admin admin, Model m,HttpServletRequest request)
				{
					System.out.println(admin);
					adminDao.updateadmin(admin);
					RedirectView r = new RedirectView();
					r.setUrl(request.getContextPath() + "/viewadmins"); // it is homepage path
					return r;
				}
			
		
	
	
	
}
