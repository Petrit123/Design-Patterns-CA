package com.MovieBookingSystem.Adapter;

import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.Strategy.CreditCard;
import com.MovieBookingSystem.Strategy.PayPal;
import com.MovieBookingSystem.Strategy.VisaCard;

public class Driver {
	
	public static void main(String[] args) {
		
		VisaCard visa = new CreditCard("Petrit Krasniqi","123",123,"12/12");
		
		PayPal pp = new PayPal();
		
		PaymentAdapterImpl pa = new PaymentAdapterImpl(pp);
		pa.payment(10);
		
		AmazonPay ap = new AmazonPay(visa);
		ap.pay(10);
		
		BookingDTO booking = new BookingDTO(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",1,1);
		booking.setPaymentMethod(ap);
	}

}
