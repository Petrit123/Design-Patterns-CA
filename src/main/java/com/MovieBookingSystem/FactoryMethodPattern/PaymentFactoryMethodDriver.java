package com.MovieBookingSystem.FactoryMethodPattern;

import java.util.ArrayList;
import java.util.List;

import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.API.Entity.SeatEntity;
public class PaymentFactoryMethodDriver {
	
	public static void main (String[] args) {
				
		PaymentFactoryMethod payment = new PaymentFactoryMethod();

		BookingDTO booking = new BookingDTO(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",1,1);
		booking.setPaymentMethod(payment.getPaymentMethod(PaymentMethodType.PAY_BY_PAYPAL));		
	}

}
