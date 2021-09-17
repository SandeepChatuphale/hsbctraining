package com.hsbc.ticket.dao.impl;

import com.hsbc.ticket.dao.UserDao;
import com.hsbc.ticket.entity.User;
import com.hsbc.ticket.exception.UserNotFoundException;

//JDBC
public class UserDaoImpl implements UserDao{

	@Override
	public User login(User existingUser) throws UserNotFoundException {
		
		if(existingUser.getUsername().equals("hsbc"))
			return existingUser;	
		
		throw new UserNotFoundException();
	}

}
