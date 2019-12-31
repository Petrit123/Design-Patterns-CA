package com.MovieBookingSystem.Strategy;

public class Revolut extends VisaCard {

	public Revolut(String nameOnCard, String cardNumber, int cvv, String expiryDate) {
	}

	public Revolut() {
	}

	@Override
	public String getCardType() {
		return "Revolut";
	}

}
