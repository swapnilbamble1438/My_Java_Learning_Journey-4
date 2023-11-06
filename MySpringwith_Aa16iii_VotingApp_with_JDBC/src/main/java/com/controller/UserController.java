package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.model.User;


@Controller
public class UserController {

ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
	
	AdminDAO adminDao = context.getBean("adminDao",AdminDAO.class);
	CandidateDAO candidateDao = context.getBean("candidateDao",CandidateDAO.class);
	UserDAO userDao = context.getBean("userDao",UserDAO.class);


	
	
	// registration page
		@RequestMapping("registration")
		public String addUsr(Model m)
		{
			m.addAttribute("title", "Registration");
			return "registration";
		}
		

	
		//handle adduser (registration)
		@RequestMapping(value="/adduser",method = RequestMethod.POST)
		public RedirectView adduser(@ModelAttribute User user, Model m,HttpServletRequest request)
		{
			RedirectView r = new RedirectView();
			
			String name = user.getName();
			System.out.println("new: " +name);
			
			User user2 = new User();
			
			int i = 0;
			List<User> listv = userDao.getusers();
			for(User v : listv)
			{
				if(v.getName().equals(name))
					{
						i++;
						
					}	
			}
			if(i >= 1)
			{
				m.addAttribute("msg","Registration Failed, Please try some different User Name");
				r.setUrl("registration"); 
			}
			else
			{
				userDao.insertuser(user);	
				m.addAttribute("rmsg", "Registration successfully, Now you can do vote");
				r.setUrl("login"); 
			}
			return r;
		}
	
		// viewusers
		@RequestMapping("viewusers")
		public String viewuser(Model m,HttpServletRequest request,HttpServletResponse response)
		{
			String dest = "viewusers";
			HttpSession session = request.getSession();
			if(session.getAttribute("namea") == null)
			{
				m.addAttribute("msg","Login to enter the page.");
				dest = "adminlogin";
			}
			else
			{
			List<User> users = userDao.getusers();
			System.out.println(users);
			m.addAttribute("users", users);
			m.addAttribute("title","View All Users Details");
			}
			return dest;
		}
		
		
		// handle deleteuser
		@RequestMapping("/deleteuser/{id}")
		public RedirectView deleteuser(@PathVariable("id") int id,HttpServletRequest request)
		{
			userDao.deleteUser(id);
			
			RedirectView rv = new RedirectView();
			rv.setUrl(request.getContextPath() + "/viewusers");
			
			return rv;
		}
		
		
		// updateuser.jsp
		@RequestMapping("/updateuser/{id}")
		public String updateuser(@PathVariable("id") int id,Model m,HttpServletRequest request,HttpServletResponse response)
		{
			String dest = "updateuser";
			HttpSession session = request.getSession();
			if(session.getAttribute("namea") == null)
			{
				m.addAttribute("msg","Login to enter the page.");
				dest = "adminlogin";
			}
			else
			{
		    User user = userDao.getuser(id);
			m.addAttribute("user",user);
			m.addAttribute("title", "Edit User Details");
			}
			return dest;
		}
		

		// handle updateuser 
			@RequestMapping(value="/handleupdateuser",method = RequestMethod.POST)
			public RedirectView handleupdateuser(@ModelAttribute User user, Model m,HttpServletRequest request)
			{
				System.out.println(user);
				userDao.updateUser(user);
				RedirectView r = new RedirectView();
				r.setUrl(request.getContextPath() + "/viewusers"); // it is homepage path
				return r;
			}
		
	
	
}
