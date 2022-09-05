package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.demo.model.User;



@Controller
public class UserController {

	@RequestMapping(value = "/users",method = RequestMethod.POST)
	public String printUserName(@RequestBody User user)
	{
		System.out.println("Printing user data"+user);
		return "index";
	}
	
	
}
