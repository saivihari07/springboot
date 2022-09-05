package com.spring_restapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_restapi.dao.UserDao;
import com.spring_restapi.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public List<User> getUsers() {

		return userDao.getUsers();

	}
	
	public void updateUser(User user,int id)
	{
		userDao.updateUser(user, id);
	}
	
	public void deleteUser(User user,int id)
	{
		userDao.deleteUser(user,id);
		
	}
}
