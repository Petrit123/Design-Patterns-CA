package com.MovieBookingSystem.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayPal implements PaymentMethod{
	
	String username;
	String email;
	String password;
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	
	public PayPal(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public void pay(double amount) {
		System.out.println(amount + " paid using PayPal");
	}
	
	  public void paymentInformation() {
	        try {
	                System.out.print("Enter PayPal email: ");
	                email = READER.readLine();
	                
	                System.out.print("Enter PayPal password: ");
	                password = READER.readLine();
	                
	                if (1==1) {
	                    System.out.println("Data verification has been successful.");
	                } else {
	                    System.out.println("Wrong email or password!");
	                }
	                
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

}
