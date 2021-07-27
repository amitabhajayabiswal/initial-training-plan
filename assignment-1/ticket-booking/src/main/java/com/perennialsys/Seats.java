package com.perennialsys;

import java.util.ArrayList;
import java.util.List;

public class Seats {
    final int MAX_AVAILABLE_SEATS;
    int availableSeats;
    ArrayList<Integer> availableSeatsList;
    
    public Seats(int totalSeats) {

        availableSeatsList = new ArrayList<>(totalSeats);
        this.MAX_AVAILABLE_SEATS = totalSeats;
        initializeAvailableSeats();
    }

    public void initializeAvailableSeats(){
        
        for (int i = 0; i < MAX_AVAILABLE_SEATS; i++)
        {
            availableSeatsList.add(i);
        }
    }

    public int getTotalAvailableSeats() {
        return availableSeatsList.size();
    }

    public synchronized boolean setTotalAvailableSeats(List<Integer> requestedSeats) {
        
        ArrayList<Integer> copy = new ArrayList<>();
		copy.addAll(requestedSeats);

        if(availableSeatsList.containsAll(copy)){
            availableSeatsList.removeAll(copy);
        }else{
            System.out.println("The requested seats are already booked");
            return false;
        }
        return true;
    }

    public ArrayList<Integer> getAvailableSeatsList() {
        return availableSeatsList;
    }

}
