package com.hsbc.ticket.service;

import com.hsbc.ticket.entity.User;
import com.hsbc.ticket.exception.UserNotFoundException;

public interface UserService {

	User login(User existingUser)throws UserNotFoundException;
}
