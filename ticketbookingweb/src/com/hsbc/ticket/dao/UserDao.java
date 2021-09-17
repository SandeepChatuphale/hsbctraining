package com.hsbc.ticket.dao;

import com.hsbc.ticket.entity.User;
import com.hsbc.ticket.exception.UserNotFoundException;

//Public interface of Dao Layer
public interface UserDao {

	User login(User existingUser)throws UserNotFoundException;
}
