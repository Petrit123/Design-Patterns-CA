package com.MovieBookingSystem.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.API.DAO.BookingDAO;
import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentMethodType;
import com.MovieBookingSystem.Strategy.PayPal;
import com.MovieBookingSystem.Template.PrinterService;
import com.MovieBookingSystem.Template.TicketPrinter;

@RestController
public class BookingController {
	
	@Autowired
	BookingDAO bookingDAO;

	@RequestMapping(method = RequestMethod.GET, produces="application/json", value = "/booking")
	@ResponseBody
	public BookingDTO findBookingById(int bookingId) {
		BookingDTO booking = new BookingDTO();
		booking = bookingDAO.findBookingById(bookingId);
		
		return booking;
	}
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json", value="/booking/create")
	@ResponseBody
	public String makeBooking(@RequestBody BookingEntity booking) {
		bookingDAO.makeBooking(booking);
		PrinterService printer = new TicketPrinter(booking);
		return printer.printTicket();
	}
	
	// Pay by PayPal
	@RequestMapping(method = RequestMethod.PUT, produces="application/json", value="/booking/paypal")
	@ResponseBody
	public void payByPal(@RequestParam int bookingId) {
		PaymentMethodType paymentMethodType= PaymentMethodType.PAY_BY_PAYPAL;
		bookingDAO.makePayment(bookingId, paymentMethodType);
	}
	
	// Pay by Credit Card
	@RequestMapping(method = RequestMethod.PUT, produces="application/json", value="/booking/creditcard")
	@ResponseBody
	public void payByCreditCard(@RequestParam int bookingId) {
		PaymentMethodType paymentMethodType= PaymentMethodType.PAY_BY_CREDIT_CARD;
		bookingDAO.makePayment(bookingId, paymentMethodType);
	}
}
