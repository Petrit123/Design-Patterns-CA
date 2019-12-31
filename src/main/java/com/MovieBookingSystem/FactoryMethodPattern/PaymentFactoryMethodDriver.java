package com.MovieBookingSystem.FactoryMethodPattern;

import java.util.ArrayList;
import java.util.List;

import com.MovieBookingSystem.Entity.BookingEntity;
import com.MovieBookingSystem.Entity.SeatEntity;
import com.MovieBookingSystem.Strategy.CreditCard;
import com.MovieBookingSystem.Strategy.VisaCard;

public class PaymentFactoryMethodDriver {
	
	public static void main (String[] args) {
				
		PaymentFactoryMethod payment = new PaymentFactoryMethod();

		SeatEntity seat = new SeatEntity("A",5,"Available");
		List<SeatEntity> seats = new ArrayList<SeatEntity>();
		seats.add(seat);
		BookingEntity booking = new BookingEntity(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",1,seats);
	    booking.pay(payment.getPaymentMethod(PaymentMethodType.PAY_BY_PAYPAL));
		
	}

}
