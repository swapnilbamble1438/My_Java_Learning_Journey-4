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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.AdminDAO;
import com.dao.CandidateDAO;
import com.dao.UserDAO;
import com.model.Candidate;
import com.model.User;


@Controller
public class VoteController {

ApplicationContext context = new ClassPathXmlApplicationContext("com/ApplicationContext.xml");
	
	AdminDAO adminDao = context.getBean("adminDao",AdminDAO.class);
	CandidateDAO candidateDao = context.getBean("candidateDao",CandidateDAO.class);
	UserDAO userDao = context.getBean("userDao",UserDAO.class);

	
	
	
	@RequestMapping("dovotes")
	public String dovotes(Model m,HttpServletRequest request,HttpServletResponse response)
	{
		
		String dest = "dovotes";
	
			HttpSession session = request.getSession();
		
		    if(session.getAttribute("name") != null)
			    {
				m.addAttribute("title","Do Voting");
				
				 //===========
				String name = (String) session.getAttribute("name");
				System.out.println(name);
			
				User user = userDao.getuserbyname(name);
				m.addAttribute("user", user);
				
				String status = "Not Voted Yet";
				List<Candidate> listc = candidateDao.getcandidates();
				for(Candidate v : listc)
				{
					if(v.getCandidate1().equals(name) 
					 || v.getCandidate2().equals(name)
					 ||v.getCandidate3().equals(name)
					 || v.getCandidate4().equals(name))
					{
						status = "Already Voted";
					}
					
					
				}
				m.addAttribute("status",status);
				System.out.println("status: " + status);
				
				//===========
				
				
				
			
			
			} 		
			else
			{
				m.addAttribute("msg","Try Login to enter the page.");
				dest="login";
			}
		    
		    return dest;
		}	
		
		
		
	
	
	
	
	// second method
	@RequestMapping(path = "processvote",method = RequestMethod.POST)
	public RedirectView processvote(@RequestParam("name") String name,
	@RequestParam("candidate") String candidate,
	 Model model)
	{
		String name2 = name;
		String candidate1 = "";
		String candidate2 = "";
		String candidate3 = "";
		String candidate4 = "";
		
		if(candidate.equals("candidate1"))
			candidate1 = name2;
		else if(candidate.equals("candidate2"))
			candidate2 = name2;
		else if(candidate.equals("candidate3"))
			candidate3 = name2;
		else if(candidate.equals("candidate4"))
			candidate4 = name2;
	
		RedirectView r = new RedirectView();
		
	
		
		
		int i = 0;
		List<Candidate> listv = candidateDao.getcandidates();
		for(Candidate v : listv)
		{
			if(v.getCandidate1().equals(name) 
			 || v.getCandidate2().equals(name)
			 || v.getCandidate3().equals(name)
			 || v.getCandidate4().equals(name))
				{
					i++;
					
				}	
		}
		if(i >= 1)
		{
			model.addAttribute("name",name);
			model.addAttribute("msg","Already Voted");	
			r.setUrl("dovotes"); 
		}
		else
		{
			Candidate c = new Candidate();
			c.setCandidate1(candidate1);	
			c.setCandidate2(candidate2);	
			c.setCandidate3(candidate3);	
			c.setCandidate4(candidate4);	
			
			candidateDao.insertcandidate(c);
			model.addAttribute("name",name);
			
			model.addAttribute("msg","Voted Successfully");	
			r.setUrl("dovotes"); 
		}
		return r;
		
	}
	
	
	
	//handle deletevote
	
	@RequestMapping("/deletevote/{id}")
	public RedirectView deletevote(@PathVariable("id") int id,HttpServletRequest request)
	{
		
		candidateDao.deletecandidate(id);
		
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath() + "/viewcandidates");
		
		return rv;
	}
	
}
