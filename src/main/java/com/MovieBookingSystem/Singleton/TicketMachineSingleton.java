package com.MovieBookingSystem.Singleton;

import com.MovieBookingSystem.API.DAO.MovieDAO;
import org.springframework.beans.factory.annotation.Autowired;

import com.MovieBookingSystem.API.DAO.BookingDAO;
import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.Template.PrinterService;
import com.MovieBookingSystem.Template.TicketPrinter;

/**
 * 
 * @author Petrit Krasniqi
 *
 */

public class TicketMachineSingleton {
	
	@Autowired
	MovieDAO movieDAO;

	@Autowired
	BookingDAO bookingDAO;

	private int totalMovieTickets = 0;
	private static volatile TicketMachineSingleton ticketMachineInstance;              // Static variable to hold one instance of the TicketMachineSingleton class
	private PrinterService printer;
	
	private TicketMachineSingleton() {                                // private constructor so no one can instantiate this class.
		
	}

	
	public int getTotalMovieTickets(String movieName, int movieTheaterId) {
		totalMovieTickets = movieDAO.findNumMovieTickets(movieName,movieTheaterId);

		return totalMovieTickets;
	}
	
	public String displayAvailableSeats() {
		String seats = "A5, A4, A3";
		return seats;
	}
	
	public String bookTicket(BookingEntity booking) {
		
		if (totalMovieTickets > 0) {
			totalMovieTickets -= 1;
			bookingDAO.makeBooking(booking);
			return "Booking successful";
		}
		else {
			return "Tickets are no longer available";
		}
	}
	
	public String printTicket(BookingEntity booking) {
		 printer = new TicketPrinter(booking);
		 return printer.printTicket();
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