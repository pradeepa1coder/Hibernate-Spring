package org.jsp.dao;

import java.util.List;

import org.jsp.dto.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {
	public User saveUser(User user) {
		getHibernateTemplate().save(user);
		return user;
	}

	public User updateUser(User user) {
		getHibernateTemplate().update(user);
		return user;
	}

	public User getUserById(int id) {
		return getHibernateTemplate().get(User.class, id);
	}

	public boolean deleteUser(int id) {
		User u = getUserById(id);
		if (u != null) {
			getHibernateTemplate().delete(u);
			return true;
		}
		return false;
	}

	public List<User> getAllUsers() {
		return getHibernateTemplate().loadAll(User.class);
	}

}
