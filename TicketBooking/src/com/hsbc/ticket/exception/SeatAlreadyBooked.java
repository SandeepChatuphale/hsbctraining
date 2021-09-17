package com.hsbc.ticket.exception;

public class SeatAlreadyBooked extends Exception{
	public SeatAlreadyBooked(int ticket) {

	}
	@Override
	public String toString()
	{
		return "Seat Already Booked";
	}
}
