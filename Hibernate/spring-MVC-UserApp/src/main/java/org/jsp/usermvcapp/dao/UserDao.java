package org.jsp.usermvcapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	EntityManager manager;
	public User saveUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
		
	}
	
	public User UpdateUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
		
	}
	
	public User getUserById(int id) {
		return manager.find(User.class, id);
	}
	
	public User verifyUser(long phone, String password)
	{
		Query q = manager.createQuery("select d from User d where d.phone=?1 and d.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<User> users = q.getResultList();
		if (users.size() > 0) 
		{
			return users.get(0);
		}
		return null;
	}
}
