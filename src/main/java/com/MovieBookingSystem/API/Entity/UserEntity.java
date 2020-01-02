package com.MovieBookingSystem.API.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.MovieBookingSystem.Observer.Observer;

@Entity
@Table(name="tbl_User")
public class UserEntity implements Observer{
	
	@Id
	@Column(name = "userid")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	
	@Column(name = "gender")
	private char gender;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "offerLetter")
	private String offerLetter;
	
	public UserEntity() {
		
	}

	public UserEntity(int id, String name, String dateOfBirth, char gender, String phoneNumber, String email, String userName, String password) {

		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
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
		return this.offerLetter;
	}

	public void update(String offers) {
//		this.offerLetter = offers;
		System.out.print("Dear " + userName + ", \n\nPlease see current deals that are on offer"
				+ " near your local cinema:\n\n" + offers);
	}
}
