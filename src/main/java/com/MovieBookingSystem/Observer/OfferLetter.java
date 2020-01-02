package com.MovieBookingSystem.Observer;

import java.util.ArrayList;

public class OfferLetter implements Subject{
	
	private ArrayList<Observer> observers;
	private String offers;
	
	public OfferLetter() {
		observers = new ArrayList<Observer>();
	}
	
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	
	public void offerLetter() {
	}
	
	public void setOffers(String offers) {
		this.offers = offers;
		notifyObservers();	
	}
	
	public String getOffers() {
		return offers;
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		System.out.print("Notify all subscribed users about new cinema offers\n\n");
		for (Observer observer : observers) {
			observer.update(this.offers);
		}
	}

}
