package com.MovieBookingSystem.API.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.API.DAO.UserDAO;
import com.MovieBookingSystem.API.DTO.UserDTO;
import com.MovieBookingSystem.API.Entity.UserEntity;
import com.MovieBookingSystem.Observer.EmailNotification;
import com.MovieBookingSystem.Observer.OfferLetter;

@RestController
public class OfferLetterController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/newOffers")
	@ResponseBody
	public void sendNewOfferLetter(@RequestBody String newOffer) {
		  List<UserEntity> users = userDAO.getAllUsers();
		 		  
		  for(UserEntity user: users) {
			  if (user.getSubscribed()) {
				  OfferLetter offerLetter = new OfferLetter();
				  
				  EmailNotification emailNotification = new EmailNotification(offerLetter);
				  
				  offerLetter.setOffers(user.getName(), newOffer);
			  }
		  }
	}
	
}
