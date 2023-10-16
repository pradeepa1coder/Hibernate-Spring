package org.jsp.controller;

import org.jsp.dao.UserDao;
import org.jsp.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SaveUser {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean(UserDao.class);
		
		User user = new User();
		user.setName("shakila");
		user.setPhone(9989398349L);
		user.setPassword("1212");
		dao.saveUser(user);
	}
}
