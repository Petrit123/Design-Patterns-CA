package com.MovieBookingSystem.Template;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.sun.jmx.snmp.Timestamp;

public abstract class PrinterService {
	
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	private Date date = new Date();
	
	public final String printTicket() {		
		try {
			
			StringBuilder ticket = new StringBuilder();
			ticket.append(ticketHeader());
			ticket.append(printTicketDetails());
			ticket.append(printTicketPrice());
			ticket.append(ticketFooter());
			
			return ticket.toString();
			
			
		} catch (Exception ex) {
			
			return "Printing Ticket Failed, Error: " + ex.toString();
		}	
	}
	
	protected String ticketHeader() {
		return "\n\n################## \n\nThis is your movie ticket. Please keep this with you at all times. \n\n"
				+ "##################\n\n Omni Cinemas";
	}
	
	abstract String printTicketDetails();
	
	abstract String printTicketPrice();
	
	protected String ticketFooter() {
		
		return formatter.format(date);
	}
	
}
