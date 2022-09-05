package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.User;



@RestController
public class UserController {

	@GetMapping("/users/{username}")
	public String printUserName(@PathVariable("username") final String name)
	{
		System.out.println("Printing user data"+name);
		return "index";
	}
	
	@GetMapping("/users/{name}/{location}/{age}")
	public String getUserInfo(@PathVariable  String name,
							  @PathVariable  String location,
							  @PathVariable  long age, Model model)
	{
		model.addAttribute("message","Spring Boot");
		System.out.println("My name is "+name+",and I am from "+location+" and my age is "+age);
		return "index";
		
	}
}
