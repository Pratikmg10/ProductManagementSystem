package com.sbcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String homePage()
	{
		return "Login";
	}
	
	@RequestMapping("register")
	public String regPage()
	{
		return "Register";
	}
	
	
	

}
