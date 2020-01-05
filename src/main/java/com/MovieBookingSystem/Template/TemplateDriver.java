package com.MovieBookingSystem.Template;

import java.util.ArrayList;
import java.util.List;

import com.MovieBookingSystem.API.DTO.BookingDTO;
import com.MovieBookingSystem.API.Entity.BookingEntity;
import com.MovieBookingSystem.API.Entity.SeatEntity;
import com.MovieBookingSystem.API.Entity.SnackEntity;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentFactoryMethod;
import com.MovieBookingSystem.FactoryMethodPattern.PaymentMethodType;
import com.MovieBookingSystem.Strategy.PayPal;

public class TemplateDriver {
	
	public static void main(String[] args) {
		
		SnackEntity snack = new SnackEntity(1, "Maltesers", "Chocolate", 4.50, 2);
		PrinterService printer = new ReceiptPrinter(snack);
		System.out.print(printer.printTicket());

	}
}