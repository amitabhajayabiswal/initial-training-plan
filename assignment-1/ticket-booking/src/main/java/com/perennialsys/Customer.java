package com.perennialsys;

import java.util.List;

public class Customer implements Runnable{
    CinemaBooking cinema;
    List<Integer> seats;

    public Customer(CinemaBooking cinema, List<Integer> seats) {
		this.cinema = cinema;
		this.seats = seats;
	}
    
    @Override
    public void run() {
        synchronized(cinema) {
			boolean flag = cinema.bookTickets(seats);
			if(flag) {
				 System.out.println("Ticket issuance successfully "+Thread.currentThread().getName()+" - location is:"+seats);
			}else {
				 System.out.println("Ticket issuance failed "+Thread.currentThread().getName()+" - not enough seats");			
			}
		}
        
    }

}
