package com.MovieBookingSystem.Observer;

public class EmailNotification implements Observer{
	
	private Subject offerLetter;
	
	public EmailNotification(Subject offerLetter) {
		this.offerLetter = offerLetter;
		offerLetter.registerObserver(this);
	}
	

	@Override
	public void update(String userName, String offers) {
		System.out.print("Dear " + userName + ", \n\nPlease see current deals that are on offer"
				+ " near your local cinema:\n\n" + offers);
	}
}