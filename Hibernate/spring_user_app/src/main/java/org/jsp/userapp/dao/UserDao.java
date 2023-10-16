package org.jsp.userapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.userapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao 
{
	@Autowired
	EntityManager manager;
	// we have to write some more methods defination
	public User saveUser(User user)
	{
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
	}
}
