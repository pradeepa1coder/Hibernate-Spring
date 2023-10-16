package org.pradeep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView verifySession(ModelAndView view) {
		view.addObject("user", "pradeep");
		view.addObject("person", "pavani");
		view.addObject("me", "vennela");
		view.setViewName("display");
		return view;
		
	}

}
