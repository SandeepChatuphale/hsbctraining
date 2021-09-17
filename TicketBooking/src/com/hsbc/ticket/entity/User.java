package com.hsbc.ticket.entity;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.ticket.task.TaskBookTicket;
import com.hsbc.ticket.task.TaskCancelTicket;

public class User {

	public static void main(String[] args) {
		Movie movie = new Movie(1, "Interstellar");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		Seat seat = new Seat(null, list, movie);
		TaskBookTicket tbt = new TaskBookTicket(seat);
		TaskCancelTicket tct = new TaskCancelTicket(seat);
		Thread husbandWorker = new Thread(tbt,"Husband");
		Thread wifeWorker = new Thread(tct,"Wife");
		husbandWorker.start();
		//wifeWorker.start();
	}

}
