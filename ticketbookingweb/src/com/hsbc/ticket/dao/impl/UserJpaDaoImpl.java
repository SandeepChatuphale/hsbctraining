package com.hsbc.ticket.dao.impl;

import com.hsbc.ticket.dao.UserDao;
import com.hsbc.ticket.entity.User;
import com.hsbc.ticket.exception.UserNotFoundException;

public class UserJpaDaoImpl implements UserDao {

	@Override
	public User login(User existingUser) throws UserNotFoundException {
		return null;
	}

}
