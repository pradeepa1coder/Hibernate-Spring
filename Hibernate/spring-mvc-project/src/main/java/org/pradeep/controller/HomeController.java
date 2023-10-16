package org.pradeep.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/*
 * It is a Controller class ,used to write the business logic,
 *  for all  different JSP files
 *  where 2 thing imp* 1.we have to map the method with home url in inside the anchor tag
 *  				   2.we have to set the link for setViewName with ourFile.jsp
 */
@Controller
public class HomeController 
{
	//======================
	
	@RequestMapping("/home")
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
		mav.addObject("user", "Balayya");
		return mav;
	}
	
	

	//===================
	
	@RequestMapping("/sum")
	public ModelAndView findSum(HttpServletRequest req)
	{
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		String result="The sum is : "+(n1+n2);
		
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("printResult.jsp");
		return view;
	}
	
	/*
	 * This is the 2 nd way to write the logic
	 * To reduce the lines of code we can go for this way by using 
	 * this Annotation
	 */
	
	@RequestMapping("/diff")
	public ModelAndView findDiff(@RequestParam(name="n1") int a,@RequestParam(name="n2")int b,ModelAndView view)
	{
		String result="The difference is : "+(a-b);
		view.addObject("result", result);
		view.setViewName("printResult.jsp");
		return view;
	}
	
	@RequestMapping("/mult")
	public ModelAndView findMult(HttpServletRequest req)
	{
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		String result="The multiplication is : "+(n1*n2);
		
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("printResult.jsp");
		return view;
	}
	
	@RequestMapping("/div")
	public ModelAndView findDiv(HttpServletRequest req)
	{
		int n1=Integer.parseInt(req.getParameter("n1"));
		int n2=Integer.parseInt(req.getParameter("n2"));
		String result="The division is : "+(n1/n2);
		
		ModelAndView view = new ModelAndView();
		view.addObject("result", result);
		view.setViewName("printResult.jsp");
		return view;
	}
	
	/*============================================
	 * Example method for by using JSTL 
	 */
	
	@RequestMapping("/display")// this display is a link, must mandatorly write in home.jsp
	public ModelAndView displayUser(ModelAndView view)
	{
		List<User> users=new ArrayList<>();
		users.add(new User(1," pradeep ",9989398349L));
		users.add(new User(2," pavani ",5432166349L));
		users.add(new User(3," vennela ",6123458349L));
		view.setViewName("viewUsers.jsp");//this viewUsers.jsp link must mandatorly
		view.addObject("us", users);	 // create as one jsp file ,inside web-app folder
		return view;
	}
	
	//=============================
	
	
}











