package com.springbootannotations.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootannotations.User;

@RestController
@RequestMapping("/springboot")
public class UserController {

	@RequestMapping(value = "/users",method = RequestMethod.POST)
	public String printUser(@RequestBody User user)
	{
		System.out.println("Printing user data"+user);
		return "Success";
	}
}
