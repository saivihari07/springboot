package com.spring_restapi.services;

import org.springframework.stereotype.Service;

import com.spring_restapi.model.User;

@Service
public class UserService {

	
	public UserService() {
		System.out.println("user-service-constructor");
	}
		
	public User getUser()
	{
		return new User("raju","kumar","raju123@gmail.com");
	}
}
