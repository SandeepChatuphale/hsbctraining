package com.hsbc.ticket.service.impl;

import com.hsbc.ticket.dao.UserDao;
import com.hsbc.ticket.dao.impl.UserDaoImpl;
import com.hsbc.ticket.dao.impl.UserJpaDaoImpl;
import com.hsbc.ticket.entity.User;
import com.hsbc.ticket.exception.UserNotFoundException;
import com.hsbc.ticket.service.UserService;

public class UserServiceImpl implements UserService{

	
	@Override
	public User login(User existingUser) throws UserNotFoundException {
		
		//THis is bad don't do it (leads to tight coupling)
		UserDao userDao = new UserDaoImpl();//JDBC
		//UserDao userDao = new UserJpaDaoImpl();//JPA
		return userDao.login(existingUser);
	}

}
