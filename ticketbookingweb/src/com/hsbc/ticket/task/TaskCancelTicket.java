package com.hsbc.ticket.task;

import com.hsbc.ticket.entity.Seat;
import com.hsbc.ticket.exception.SeatNotBooked;

public class TaskCancelTicket implements Runnable{
	Seat seat;
	public TaskCancelTicket(Seat seat)
	{
		this.seat=seat;
	}
	@Override
	public void run() {
		try {
			seat.cancelTickets(1);
		} catch (SeatNotBooked e) {
			e.printStackTrace();
		}
	}

}