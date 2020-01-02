package com.MovieBookingSystem.Observer;

import java.util.Date;

import com.MovieBookingSystem.API.Entity.UserEntity;

public class ObserverDriver {
	
	public static void main(String[] args) {
		
		OfferLetter offers = new OfferLetter();
		
        UserEntity user1 = new UserEntity(1,"Petrit","Tue Dec 31 20:50:15 GMT 201",'M',"12345","Petritt.k","Petrit123","Hello123");
		
		offers.registerObserver(user1);
		
		offers.setOffers("Tuesday Special: All tickets €5");
		
	}

}
