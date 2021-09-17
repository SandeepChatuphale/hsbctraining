package com.hsbc.ticket.task;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.ticket.entity.Movie;
import com.hsbc.ticket.entity.Seat;
import com.hsbc.ticket.exception.SeatAlreadyBooked;

public class TaskBookTicket implements Runnable 
{
	
	Seat seat;
	public TaskBookTicket(Seat seat)
	{
		this.seat=seat;
	}
	@Override
	public void run() 
	{
		try 
		{
			Movie movie = new Movie(1, "Interstellar");
			List<Integer> list = new ArrayList<Integer>();
			for(int i=1;i<=10;i++)
			{
				list.add(i);
			}
			seat = new Seat(null,list,movie);
			seat.bookTickets(1);
		} 
		catch (SeatAlreadyBooked e) 
		{
			e.printStackTrace();
		}
	}

}
