package com.MovieBookingSystem.API.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.MovieBookingSystem.API.DAO.BookingDAO;
import com.MovieBookingSystem.API.DAO.MovieDAO;
import com.MovieBookingSystem.Singleton.TicketMachineSingleton;
import com.MovieBookingSystem.API.Entity.BookingEntity;

@RestController
public class TicketMachineController {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	BookingDAO bookingDAO;
	
	@Autowired
	MovieDAO movieDAO;
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/TicketMachine/Print/Ticket")
	@ResponseBody
	public String printTicket(@RequestBody BookingEntity booking) {
		String ticket = TicketMachineSingleton.getTicketMachineSingletonInstance().printTicket(booking);
		
		return ticket;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/TicketMachine/tickets")
	@ResponseBody
	public int getTotalTickets(@RequestParam String movieName, int movieTheaterId) {
		
		try {
			
		TicketMachineSingleton.getTicketMachineSingletonInstance().totalMovieTickets = movieDAO.findNumMovieTickets(movieName, movieTheaterId);	
		
		
		} catch (Exception e) {
			
		}
		return TicketMachineSingleton.getTicketMachineSingletonInstance().getTotalMovieTickets();

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
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json", value="/TicketMachine/booking")
	@ResponseBody
	public String bookTicket(@RequestBody BookingEntity booking) {
		
		String message = "";
		
		try {
			TicketMachineSingleton.totalMovieTickets = movieDAO.findMovieTicketsByMovieId(booking.getMovieId(), booking.getMovieTheaterId());
			TicketMachineSingleton.getTicketMachineSingletonInstance().bookTicket();			
			if (TicketMachineSingleton.ticketsAvailable && booking.getNumTickets() <= TicketMachineSingleton.totalMovieTickets) {
				bookingDAO.makeBooking(booking);
				movieDAO.updateNumTickets(booking.getMovieId(), booking.getMovieTheaterId());
				message =  "Booking successful"; 
			}
			else {
				 message = "Tickets are no longer available";	
			}
			 
			
		} catch (Exception e) {
			
			message = e.getMessage();			
		}
		
		return message;
	}
}