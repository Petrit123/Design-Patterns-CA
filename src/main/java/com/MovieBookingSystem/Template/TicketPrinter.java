package com.MovieBookingSystem.Template;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.util.Arrays;
import java.util.List;

import com.MovieBookingSystem.Entity.BookingEntity;

public class TicketPrinter extends PrinterService{
	
	private BookingEntity booking;
	
	public TicketPrinter(BookingEntity booking) {
		this.booking = booking;
	}
	
	public TicketPrinter() {
		
	}

	@Override
	String printTicketDetails() {
	

		return "\n\n\nMovie Showing Date: " + booking.getMovieShowingTime() +
			   "\n\nSeat: " + booking.getSeatId() +
			   "\n\nTicket Booking Status: " + booking.getBookingStatus() +
			   "\n\nTicket(s): " + booking.getNumTickets() + "\n\n";
		
	}

	@Override
	String printTicketPrice() {
		return "Price: " + booking.getAmount() + "\n\n";
	}
}
