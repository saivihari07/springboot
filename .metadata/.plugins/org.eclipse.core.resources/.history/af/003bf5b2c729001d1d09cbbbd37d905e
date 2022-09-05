package com.spring_restapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring_restapi.model.User;



@Transactional
@Repository
public class UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;


	public void saveUser(User user) {
		this.hibernateTemplate.save(user);
		
	}
		
	public List<User> getUsers()
	{
		return hibernateTemplate.loadAll(User.class);
	}

	public void updateUser(User user,int id)
	{
		user.setId(id);
		this.hibernateTemplate.update(user);
	}
	
	public void deleteUser(User user,int id)
	{
		
		this.hibernateTemplate.delete("user", user);
	}
	
}
