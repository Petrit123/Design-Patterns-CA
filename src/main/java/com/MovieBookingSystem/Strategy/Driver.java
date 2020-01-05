package com.MovieBookingSystem.Strategy;

import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.API.Entity.BookingEntity;

public class Driver {
	public static void main(String[] args) {
		
		BookingDTO booking = new BookingDTO(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",2,1);
		booking.setPaymentMethod(new CreditCard());
	}

}
