package com.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.AdminDAO;
import com.dao.CandidateDAO;
import com.dao.UserDAO;
import com.model.Admin;
import com.model.User;

@Controller
public class LoginController {

	
ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
	
	AdminDAO adminDao = context.getBean("adminDao",AdminDAO.class);
	CandidateDAO candidateDao = context.getBean("candidateDao",CandidateDAO.class);
	UserDAO userDao = context.getBean("userDao",UserDAO.class);


	// login.jsp
	@RequestMapping("login")
	public String login(Model m,HttpServletRequest request,HttpServletResponse response)
	{
		
		HttpSession session = request.getSession(true); //getting to session object

		if(session!=null) // check if condition the session not null

		{
			session.removeAttribute("name");
		session.invalidate(); //using this method to destroy the sesion object

		
		}
		
		m.addAttribute("title","User Login");
		return "login";
	}
		
	
	// adminlogin.jsp
		@RequestMapping("adminlogin")
		public String adminlogin(Model m,HttpServletRequest request,HttpServletResponse response)
		{
				
			HttpSession session = request.getSession(true); //getting to session object

			if(session!=null) // check if condition the session not null

			{
				session.removeAttribute("namea");
			session.invalidate(); //using this method to destroy the sesion object

			
			}
			
			m.addAttribute("title","Admin Login");
			return "adminlogin";
			
			
		}
	
	
	
	// check login
			@RequestMapping(value="/checklogin",method = RequestMethod.POST)
			public RedirectView checklogin(@ModelAttribute User user, Model m,HttpServletRequest request,HttpServletResponse response)
			{
				RedirectView r = new RedirectView();
				
				String name = user.getName();
				String password = user.getPassword();
			
				
				int i = 0;
				List<User> listv = userDao.getusers();
				for(User v : listv)
				{
					if(v.getName().equals(name) && v.getPassword().equals(password))
						{
							i++;
							
						}	
				}
				if(i >= 1)
				{
				//	m.addAttribute("name",name);
					 HttpSession session = request.getSession();
					 session.setAttribute("name", name);

					Cookie a = new Cookie("a","a");
					 a.setMaxAge(9999);
						response.addCookie(a);
						
			            
					r.setUrl("dovotes"); 
				}
				else
				{	
					Cookie b = new Cookie("b","b");
					b.setMaxAge(10);
					response.addCookie(b);
					r.setUrl("login"); 
				}
				return r;
			}
			
			
			// check admin
						@RequestMapping(value="/checkadmin",method = RequestMethod.POST)
						public RedirectView checkadmin(@ModelAttribute Admin admin, Model m,HttpServletRequest request,HttpServletResponse response)
						{
							RedirectView r = new RedirectView();
							
							String name = admin.getName();
							String password = admin.getPassword();
						
		
							
							int i = 0;
							List<Admin> lista = adminDao.getadmins();
							for(Admin v : lista)
							{
								if(v.getName().equals(name) && v.getPassword().equals(password))
									{
										i++;
										
									}	
							}
							if(i >= 1)
							{
								HttpSession session = request.getSession();
								 session.setAttribute("namea", name);

								Cookie c = new Cookie("c","c");
								c.setMaxAge(9999);
								response.addCookie(c);
									
								m.addAttribute("name",name);
								r.setUrl("adminhome"); 
							}
							else
							{	
								Cookie d = new Cookie("d","d");
								d.setMaxAge(10);
								response.addCookie(d);
						
								r.setUrl("adminlogin"); 
							}
							return r;
						}
				
	
	
}
