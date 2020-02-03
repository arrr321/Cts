package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	//@RequestMapping(can also be used)
	public String goToHome()
	{
		
		return"index";
	}

}
