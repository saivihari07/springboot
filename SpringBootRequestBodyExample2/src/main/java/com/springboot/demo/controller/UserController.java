package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.User;



@RestController
public class UserController {

	@PostMapping("/users")
	public String printUserName(@RequestBody User user )
	{
		System.out.println("Printing user data"+user);
		return "index";
	}
	
	
}
