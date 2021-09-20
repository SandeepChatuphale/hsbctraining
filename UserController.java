package com.hsbc.ticket.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.ticket.entity.User;
import com.hsbc.ticket.exception.UserNotFoundException;
import com.hsbc.ticket.service.UserService;
import com.hsbc.ticket.service.impl.UserServiceImpl;

@WebServlet("/user")//URL pattern
public class UserController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1 Fetched from End user
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//2 - Validate check 
		//3 - If this request is from valid IP
		
		//Are for server side
		UserService userService = new UserServiceImpl();
		
		User existingUser  = new User();
		existingUser.setPassword(password);
		existingUser.setUsername(username);
		
		RequestDispatcher rd = null;
		try
		{
			//what to show if success
			//show ticket booking page
			//Page to be shown after successful login
			String target = "views/bookings.jsp";
			
			User loggedInUser =  userService.login(existingUser);
			//List<Role> roles =  loggedInUser.getAllRoles();
			
			
			HttpSession session = req.getSession();
			session.setAttribute("user", loggedInUser);
		
			rd = req.getRequestDispatcher(target);
			//req.setAttribute("user", loggedInUser);			
			rd.forward(req, resp);
		
		}
		catch (UserNotFoundException e) 
		{
			//what to show if login fails
			//show login again with error message
			
			rd = req.getRequestDispatcher("views/login.jsp");
			//resp.sendRedirect("views/login.jsp");//generates new reqeust
			req.setAttribute("error", "Credentials are wrong try again");
			req.setAttribute("username", existingUser.getUsername());
			rd.forward(req, resp);
			e.printStackTrace();
		}
	}	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession(false);

		//This will destroy session and removes all attributes 
		httpSession.invalidate();
		
		resp.sendRedirect("views/login.jsp");
	}
}










