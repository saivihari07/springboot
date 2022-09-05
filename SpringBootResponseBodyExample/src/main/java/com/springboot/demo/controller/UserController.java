package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.demo.model.User;



@Controller
public class UserController {

	@ResponseBody
	@GetMapping("/users")
	public User getUser()
	{
		User user = new User();
		user.setName("saivihari");
		user.setLocation("Hyderabad");
		user.setAge(24);
		return user;
	}
}
