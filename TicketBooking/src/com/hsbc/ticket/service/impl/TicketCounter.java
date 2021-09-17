package com.hsbc.ticket.service.impl;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import com.hsbc.ticket.entity.Movie;
import com.hsbc.ticket.entity.Seat;
import com.hsbc.ticket.entity.User;

public class TicketCounter {
	Map<Movie,Set<Seat>> ticketBooking;
	public TicketCounter(Map<Movie, Set<Seat>> ticketBooking) {
		//super();
		this.ticketBooking = ticketBooking;
	}
	
	// Business Logic
	synchronized public boolean bookTicket(Movie movie, Seat toBeBooked, User user)
	{
		// start transaction
		// Check if that movie exists
		// Check if seats are available for this movie 
		// Complete Payment Process - This is typically calling third party API
			// 1. Connect to server
			// 2. Send the data(amount, accountNumber)
			// 3. Retrieve status(status)
			// 4. Perform operations based on the status
		// If Process complete, then book the ticket
		// If yes, book the ticket - commit transaction
		// If no, HousefullException - rollback transaction
		return true;
	}
	synchronized public boolean cancelTicket(Movie movie, Seat toBeCancelled, User user)
	{
		// Check if that movie exists
		// Check if seats are booked for this movie 
		// Complete Refund Process - This is typically calling third party API
		// If Process complete, then cancel the ticket and add it back to the pool of free Seats
		return true;
	}
	public void businessPerformance(Movie movie)
	{
		
	}
	public void businessPerformance(Movie movie, Date date)
	{
		
	}
}
