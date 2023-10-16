package org.jsp.usermvcapp.controller;

import org.jsp.usermvcapp.dto.User;
import org.jsp.usermvcapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names= {"u"})
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/load")
	public ModelAndView load(ModelAndView view) {
		view.setViewName("register");
		view.addObject("user", new User());
		return view;

	}
	@RequestMapping("/reg")
	public ModelAndView saveUser(@ModelAttribute User user, ModelAndView view) {
		user = service.saveUser(user);
		view.setViewName("print");
		view.addObject("message", "User saved with id : " + user.getId());
		return view;
	}
	
	@RequestMapping("/loginpage")
	public String login(@RequestParam long phone,@RequestParam  String password,Model m)
	{
		User user=service.verifyUser(phone, password);
		if(user!=null)
		{
		   m.addAttribute("u", user);
		   return "home";
			
		}
		else
		{
			return "relogin";
		}
	}
	
	@RequestMapping("/reloging")
	public String regin()
	{
		return "login";
		
	}
}
