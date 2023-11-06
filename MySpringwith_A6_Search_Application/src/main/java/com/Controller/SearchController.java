package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("going to home view...");
		return "home";
	}
	
	// @RequestMapping(name="/search")
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query)
	{
		RedirectView rv = new RedirectView();
		if(query.isBlank())
		{
			rv.setUrl("redirect:/search");
			return rv;
		}
		
		String url="https://www.google.com/search?q="+query;
		rv.setUrl(url);
		return rv;
	}
}
