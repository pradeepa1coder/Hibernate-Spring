package org.jsp.userapp.service;

import org.jsp.userapp.dao.UserDao;
import org.jsp.userapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	private UserDao dao;
	// we have to write some more methods
	public User saveUser(User user)
	{
		return dao.saveUser(user);
	}
}
