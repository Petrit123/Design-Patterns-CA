package com.MovieBookingSystem.API.DTO;

import com.MovieBookingSystem.API.Entity.UserEntity;

public class UserDTO {
	
	private int id;
	
	private String name;
	
	private String dateOfBirth;
	
	private char gender;
	
	private String phoneNumber;
	
	private String email;
	
	private String userName;
	
	private String password;
	
	private String offerLetter;
	
	public UserDTO() {
		
	}
	
	public UserDTO(int id, String name, String dateOfBirth, char gender, String phoneNumber, String email,
			String userName, String password, String offerLetter) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.offerLetter = offerLetter;
	}
	
	public UserDTO(UserEntity entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.dateOfBirth = entity.getDateOfBirth();
		this.gender = entity.getGender();
		this.phoneNumber = entity.getPhoneNumber();
		this.email = entity.getEmail();
		this.userName = entity.getUserName();
		this.password = entity.getPassword();
		this.offerLetter = entity.getOfferLetter();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOfferLetter() {
		return offerLetter;
	}

	public void setOfferLetter(String offerLetter) {
		this.offerLetter = offerLetter;
	}
	
}
