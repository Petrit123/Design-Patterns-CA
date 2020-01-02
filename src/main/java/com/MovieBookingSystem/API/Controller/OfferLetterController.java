package com.MovieBookingSystem.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.API.DAO.UserDAO;

@RestController
public class OfferLetterController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/newOffers")
	@ResponseBody
	public void sendNewOfferLetter(@RequestBody String newOffer) {
		userDAO.sendOfferLetters(newOffer);
	}

}
