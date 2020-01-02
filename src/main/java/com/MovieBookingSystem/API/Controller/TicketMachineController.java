package com.MovieBookingSystem.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.API.DAO.BookingDAO;
import com.MovieBookingSystem.Singleton.TicketMachineSingleton;
import com.MovieBookingSystem.API.Entity.BookingEntity;

@RestController
public class TicketMachineController {
	
	@Autowired
	BookingDAO bookingDAO;
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/TicketMachine/Print/Ticket")
	@ResponseBody
	public String printTicket(@RequestBody BookingEntity booking) {
		String ticket = TicketMachineSingleton.getTicketMachineSingletonInstance().printTicket(booking);
		
		return ticket;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/TicketMachine/tickets")
	@ResponseBody
	public int getTotalTickets() {
		int totalTickets = 0;
		try {
			
			totalTickets = TicketMachineSingleton.getTicketMachineSingletonInstance().getTotalMovieTickets();
			
			return totalTickets;
		} catch (Exception e) {
			
		}
		
		return 0;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/TicketMachine/seats")
	@ResponseBody
	public String getAvailableSeats() {
		
		String availableSeats = "";
		
		try {
			
			availableSeats = TicketMachineSingleton.getTicketMachineSingletonInstance().displayAvailableSeats();
			
			return availableSeats;
		} catch (Exception e) {
			
		}
		
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/TicketMachine/booking")
	@ResponseBody
	public String bookTicket() {
		
		String message = "";
		
		try {
			
			 message = TicketMachineSingleton.getTicketMachineSingletonInstance().bookTicket();
			 
			 return message;
			
		} catch (Exception e) {
			
			message = e.getMessage();			
		}
		
		return null;
	}
}
