package com.MovieBookingSystem.Strategy;

public class CreditCard extends VisaCard {

	public CreditCard(String nameOnCard, String cardNumber, int cvv, String expiryDate) {
	}

	public CreditCard() {

	}

	@Override
	public String getCardType() {
		return "Credit Card";
	}

	@Override
	protected void validatePayment() {
		// TODO Auto-generated method stub
		
	}

}
