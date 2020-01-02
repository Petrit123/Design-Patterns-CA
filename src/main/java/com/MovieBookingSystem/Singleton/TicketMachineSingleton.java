package com.MovieBookingSystem.Singleton;

import org.springframework.beans.factory.annotation.Autowired;

import com.MovieBookingSystem.Entity.BookingDAO;

/**
 * 
 * @author Petrit Krasniqi
 *
 */

public class TicketMachineSingleton {
	
	@Autowired
	BookingDAO bookingDAO;

	private int totalMovieTickets = 10;
	private static volatile TicketMachineSingleton ticketMachineInstance;              // Static variable to hold one instance of the TicketMachineSingleton class
	
	private TicketMachineSingleton() {                                // private constructor so no one can instantiate this class.
		
	}

	
	public int getTotalMovieTickets() {
		return totalMovieTickets;
	}
	
	public String displayAvailableSeats() {
		String seats = "A5, A4, A3";
		return seats;
	}
	
	public String bookTicket() {
		
		if (totalMovieTickets > 0) {
			totalMovieTickets -= 1;
			return "Booking successful";
		}
		else {
			return "Tickets are no longer available";
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
