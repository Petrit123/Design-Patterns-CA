package com.MovieBookingSystem.Singleton;

import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.Template.PrinterService;
import com.MovieBookingSystem.Template.TicketPrinter;

/**
 * 
 * @author Petrit Krasniqi
 *
 */

public class TicketMachineSingleton {
	
	public static int totalMovieTickets = 0;
	public static boolean ticketsAvailable;
	private static volatile TicketMachineSingleton ticketMachineInstance;              // Static variable to hold one instance of the TicketMachineSingleton class
	private PrinterService printer;
	
	private TicketMachineSingleton() {                                                 // private constructor so no one can instantiate this class.
		
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

	
	public int getTotalMovieTickets() {
		return totalMovieTickets;
	}
	
	public String displayAvailableSeats() {
		String seats = "A5, A4, A3";
		return seats;
	}
	
	public void bookTicket() {
		
		if (totalMovieTickets > 0) {
			totalMovieTickets -= 1;
			ticketsAvailable = true;
		}
		else {
			ticketsAvailable = false;
		}
	}
	
	public String printTicket(BookingEntity booking) {
		 printer = new TicketPrinter(booking);
		 return printer.printTicket();
	}	

}