package com.hsbc.ticket.entity;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.ticket.exception.SeatAlreadyBooked;
import com.hsbc.ticket.exception.SeatNotBooked;
import com.hsbc.ticket.task.TaskBookTicket;
import com.hsbc.ticket.task.TaskCancelTicket;

public class Seat {
	Movie movie;
	List<Integer> bookedSeats;
	List<Integer> freeSeats;
	int row;
	String column;
	boolean availibility;
	public Seat(List<Integer> bookedSeats, List<Integer> freeSeats, Movie movie) {
		this.movie = movie;
		this.bookedSeats = bookedSeats;
		for(int i=1;i<=10;i++)
		{
			freeSeats.add(i);
		}
		
	}
	
	public List<Integer> getFreeSeats() {
		return freeSeats;
	}

	public void setFreeSeats(List<Integer> freeSeats) {
		this.freeSeats = freeSeats;
	}

	public void setBookedSeats(List<Integer> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

	synchronized public void bookTickets(int ticket) throws SeatAlreadyBooked
	{
			if(freeSeats.contains(ticket))
			{
				freeSeats.remove(ticket);
				bookedSeats.add(ticket);
			}
			else
				System.out.println("Seat Already Booked");
	}
	synchronized public void cancelTickets(int ticket) throws SeatNotBooked
	{
			if(bookedSeats.contains(ticket))
			{
				bookedSeats.remove(ticket);
				freeSeats.add(ticket);
			}
			else
				System.out.println("Seat Not Booked");
	}
	
}
