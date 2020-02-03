package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String showForm()
	{
		return "show-form";
		
		
	}
	
	@RequestMapping("/processForm")
	public String processForm( HttpServletRequest request , Model model)
	{
		
		String sName = request.getParameter("sName");
		model.addAttribute("mesg",sName);
		
		return "process-form";
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
