package com.MovieBookingSystem.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	public int getTotalTickets(@RequestParam String movieName, int movieTheaterId) {
		//int totalTickets = 10;
		//try {
			
		int	totalTickets = TicketMachineSingleton.getTicketMachineSingletonInstance().getTotalMovieTickets(movieName, movieTheaterId);
			System.out.print("Petrit");
			
			//return totalTickets;
//		} catch (Exception e) {
//			
//		}
		
		return totalTickets;
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
	public String bookTicket(@RequestBody BookingEntity booking) {
		
		String message = "";
		
		try {
			
			 message = TicketMachineSingleton.getTicketMachineSingletonInstance().bookTicket(booking);
			 
			 return message;
			
		} catch (Exception e) {
			
			message = e.getMessage();			
		}
		
		return null;
	}
}