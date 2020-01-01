package com.MovieBookingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.MovieBookingSystem.Entity.UserDAO;
import com.MovieBookingSystem.Entity.UserDTO;
import com.MovieBookingSystem.Entity.UserEntity;

@RestController
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", value="/user")
	@ResponseBody
	public UserDTO findUser(@RequestParam String userName) {
		UserDTO user = new UserDTO();
		user = userDAO.getUserByUserName(userName);
		
		return user;
	}
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json", value="/user/create")
	@ResponseBody
	public void createUser(@RequestBody UserEntity user) {
		userDAO.createUser(user);
	}

}
