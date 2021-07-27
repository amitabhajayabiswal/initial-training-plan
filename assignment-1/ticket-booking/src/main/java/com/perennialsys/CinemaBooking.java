package com.perennialsys;


import java.util.List;

public class CinemaBooking {

    List<Integer> available; //Available location
	String name; //Name
	Seats seats;

	public CinemaBooking( String name, int totalSeatsCinema) {
		
		this.name = name;
		seats = new Seats(totalSeatsCinema);
		this.available = seats.getAvailableSeatsList();
	}
	
	 //Buy tickets
	public boolean bookTickets(List<Integer> seat) {

		System.out.println("Welcome "+this.name+", the current available position is: "+available.toString());
		boolean returnBool = seats.setTotalAvailableSeats(seat);
		System.out.println("Tickets available after booking " + available.toString());
		return returnBool;
	}

}
