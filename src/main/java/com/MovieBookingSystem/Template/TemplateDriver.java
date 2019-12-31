package com.MovieBookingSystem.Template;

import java.util.ArrayList;
import java.util.List;

import com.MovieBookingSystem.Entity.BookingEntity;
import com.MovieBookingSystem.Entity.SeatEntity;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentFactoryMethod;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentMethodType;

public class TemplateDriver {
	
	public static void main(String[] args) {
		
		PaymentFactoryMethod payment = new PaymentFactoryMethod();

		SeatEntity seat = new SeatEntity("A",5,"Available");
		BookingEntity booking = new BookingEntity(1,1,1,1,50.0,"21:33:09","26/12/2019","Confirmed",1,seat);
	    booking.pay(payment.getPaymentMethod(PaymentMethodType.PAY_BY_PAYPAL));
	    
	    PrinterService ticket = new TicketPrinter(booking);
	    System.out.print(ticket.printTicket());

	}
}