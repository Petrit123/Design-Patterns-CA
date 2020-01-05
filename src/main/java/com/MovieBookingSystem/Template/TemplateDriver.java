package com.MovieBookingSystem.Template;

import java.util.ArrayList;
import java.util.List;

import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.API.Entity.SeatEntity;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentFactoryMethod;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentMethodType;
import com.MovieBookingSystem.Strategy.PayPal;

public class TemplateDriver {
	
	public static void main(String[] args) {
		
		PaymentFactoryMethod payment = new PaymentFactoryMethod();

		SeatEntity seat = new SeatEntity("A",5,"Available");
		BookingDTO booking = new BookingDTO(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",1,1);
	    booking.setPaymentMethod(new PayPal());
	    
	}
}