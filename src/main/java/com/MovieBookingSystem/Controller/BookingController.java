package com.MovieBookingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.Entity.BookingDAO;
import com.MovieBookingSystem.Entity.BookingDTO;
import com.MovieBookingSystem.Entity.BookingEntity;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentMethodType;
import com.MovieBookingSystem.Strategy.PayPal;

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
	public void makeBooking(@RequestBody BookingEntity booking) {
		bookingDAO.makeBooking(booking);
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
