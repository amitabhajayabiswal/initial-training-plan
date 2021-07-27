package com.perennialsys;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
		int totalSeatsCinema = 10;
       
		List<Integer> seatRequested1 =new ArrayList<Integer>();
		seatRequested1.add(1);
		seatRequested1.add(2);

		List<Integer> seatsRequested2 =new ArrayList<Integer>();
		seatsRequested2.add(3);
		seatsRequested2.add(6);
		
		List<Integer> seatsRequested3 =new ArrayList<Integer>();
		seatsRequested2.add(2);
		seatsRequested2.add(6);
		
		CinemaBooking c = new CinemaBooking("happy sxt",totalSeatsCinema);
		new Thread(new Customer(c,seatRequested1),"Amitabh").start();
		new Thread(new Customer(c,seatsRequested2),"Ajaya").start();
		new Thread(new Customer(c,seatsRequested3),"Abhishek").start();

    }
}
