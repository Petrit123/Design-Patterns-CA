package com.MovieBookingSystem.Singleton;

/**
 * 
 * @author Petrit Krasniqi
 *
 */

public class TicketMachineSingleton {
	
	private boolean bookedOut;
	private int totalMovieTickets;
	private static volatile TicketMachineSingleton ticketMachineInstance;              // Static variable to hold one instance of the TicketMachineSingleton class

	private TicketMachineSingleton() {                                // private constructor so no one can instantiate this class.
		
		bookedOut = true;
		totalMovieTickets = 10;
	}

	
	public int getTotalMovieTickets() {
		return totalMovieTickets;
	}
	
	public void displayAvailableSeats() {
		String seats = "blah";
		System.out.println("Seats available: " + seats);
	}
	
	public void bookTicket() {
		
		if (totalMovieTickets > 0) {
			totalMovieTickets -= 1;
		}
		else {
			System.out.print("Tickets are no longer available");
		}
	}
		
	public static TicketMachineSingleton getTicketMachineSingletonInstance() {
		if (ticketMachineInstance == null) {
			
			synchronized (TicketMachineSingleton.class) {
				if (ticketMachineInstance == null) {
					
					ticketMachineInstance = new TicketMachineSingleton();
				}
		    }			
	}
		return ticketMachineInstance;
	}
	

}
