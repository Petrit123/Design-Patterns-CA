package com.MovieBookingSystem.Template;

import com.MovieBookingSystem.API.Entity.SnackEntity;

public class ReceiptPrinter extends PrinterService {

	
	private SnackEntity snacks;
	
	public ReceiptPrinter(SnackEntity snacks) {
		this.snacks= snacks;
	}
	
	public ReceiptPrinter() {
		
	}
	
	@Override
	protected String ticketHeader() {
		
			return "\n\n################## \n\nThis is your receipt. Please keep this with you at all times. \n\n"
					+ "##################\n\n Omni Cinemas";
	
	}

	@Override
	String printTicketDetails() {
	

		return "\n\n\nName: " + snacks.getName() +
			   "\n\nDescription: " + snacks.getDescription() +
			   "\n\nQuantity: " + snacks.getQuantity() + "\n\n";
		
	}

	@Override
	String printTicketPrice() {
		return "Price: " + snacks.getPrice() * snacks.getQuantity() + "\n\n";
	}

	
}