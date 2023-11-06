package com.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.CandidateDAO;

import com.model.Candidate;



@Controller
public class CandidateController {
	
	@Autowired
	private CandidateDAO candidateDao;
	
	
	

	@RequestMapping("addcandidate")
	public String home(Model m)
	{
		
		m.addAttribute("title","Add Candidate");
		return "addcandidate";
	}
	
	
	//handle addcandidate (registration)
			@RequestMapping(value="/handleaddcandidate",method = RequestMethod.POST)
			public RedirectView handleaddcandidate(@ModelAttribute Candidate candidate, Model m,HttpServletRequest request)
			{
				System.out.println(candidate);
				candidateDao.insertcandidate(candidate);
				RedirectView r = new RedirectView();
				r.setUrl(request.getContextPath() + "/"); // it is homepage path
				return r;
			}
			
			
			// viewcandidates
			@RequestMapping("viewcandidates")
			public String viewuser(Model m,HttpServletRequest request,HttpServletResponse response)
			{
				String dest = "viewcandidates";
				HttpSession session = request.getSession();
				if(session.getAttribute("namea") == null)
				{
					m.addAttribute("msg","Login to enter the page.");
					dest = "adminlogin";
				}
				else
				{
				List<Candidate> candidates = candidateDao.getcandidates();
				System.out.println(candidates);
				m.addAttribute("candidates", candidates);
				m.addAttribute("title","View All Candidates Details");
				
				
				// view total number of votes
				int c1=0;
				int c2=0;
				int c3=0;
				int c4=0;
				
				List<Candidate> listc = candidateDao.getcandidates();
				for(Candidate v : listc)
				{
					if(!v.getCandidate1().equals(""))
						c1= c1 + 1;
					if(!v.getCandidate2().equals(""))
						c2= c2 + 1;
					if(!v.getCandidate3().equals(""))
						c3= c3 + 1;
					if(!v.getCandidate4().equals(""))
						c4= c4 + 1;
				}
				
				m.addAttribute("c1",c1);
				m.addAttribute("c2",c2);
				m.addAttribute("c3",c3);
				m.addAttribute("c4",c4);
				}
				
				return dest;
			}
			
			
		
			
			
			
			
			


}


