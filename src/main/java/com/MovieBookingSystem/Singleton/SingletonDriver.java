package com.MovieBookingSystem.Singleton;

public class SingletonDriver {
	
	public static void main(String[] args) {
		
		TicketMachineSingleton.getTicketMachineSingletonInstance().getTotalMovieTickets();
	}
}
