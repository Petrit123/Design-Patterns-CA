package FactoryMethodPattern;

import Entity.SeatEntity;

import java.util.ArrayList;
import java.util.List;

import Entity.BookingEntity;
import Strategy.CreditCard;
import Strategy.VisaCard;

public class PaymentFactoryMethodDriver {
	
	public static void main (String[] args) {
				
		PaymentFactoryMethod payment = new PaymentFactoryMethod();
//		
//		payment.getPaymentMethod("PAY");
		SeatEntity seat = new SeatEntity("A",5,"Available");
		List<SeatEntity> seats = new ArrayList<SeatEntity>();
		seats.add(seat);
		BookingEntity booking = new BookingEntity(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",1,seats);
		booking.pay(payment.getPaymentMethod("PAY_BY_PAYPAL"));				
		
	}

}
