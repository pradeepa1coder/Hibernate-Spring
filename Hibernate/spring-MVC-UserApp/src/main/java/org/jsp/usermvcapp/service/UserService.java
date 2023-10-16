package org.jsp.usermvcapp.service;

import org.jsp.usermvcapp.dao.UserDao;
import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao dao;

	public User saveUser(User user)
	{
		return dao.saveUser(user);

	}

	public User getUser(int id)
	{
		return dao.getUserById(id);

	}



//	public boolean deleteUser(int id)
//	{
//		return dao.deleteUser(id);
//
//	}

public User verifyUser(long phone,String password) 
{
	return dao.verifyUser(phone,password);
}


}
