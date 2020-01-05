package com.MovieBookingSystem.Adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.MovieBookingSystem.Strategy.PaymentMethod;
import com.MovieBookingSystem.Strategy.VisaCard;

public class AmazonPay implements PaymentMethod{
	
	private  String cardOwnerName;
	private String customerCardNumber;
	private int cvvNumber;
	private String cardExpiryDate;
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	
	private final VisaCard visaCard;
	
	
	public AmazonPay(VisaCard visaCard) {
		this.visaCard = visaCard;
		convertToAmazonPay();
	}
	
	public String getCardOwnerName() {
		return cardOwnerName;
	}
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}
	public String getCustomerCardNumber() {
		return customerCardNumber;
	}
	public void setCustomerCardNumber(String customerCardNumber) {
		this.customerCardNumber = customerCardNumber;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}
	
	public void validatePayment() {
		
	};
	
	public void paymentInformation() {
		try {
			
			System.out.print("Card Holder Name: ");
			cardOwnerName = READER.readLine();
			
			System.out.print("Card Number: ");
			customerCardNumber = READER.readLine();
			
			System.out.print("Enter CVV: ");
			cvvNumber = Short.parseShort(READER.readLine());
			
			System.out.print("Enter Card Expiry Date: ");
			cardExpiryDate = READER.readLine();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private void convertToAmazonPay() {
		setCardOwnerName(this.visaCard.getNameOnCard());
		setCustomerCardNumber(this.visaCard.getCardNumber());
		setCvvNumber(this.visaCard.getCvv());
		setCardExpiryDate(this.visaCard.getExpiryDate());		
	}

	@Override
	public void pay(double amount) {
		paymentInformation();
		System.out.println(amount + " paid with Amazon Pay " );
	}

}
