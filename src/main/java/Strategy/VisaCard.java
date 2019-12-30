package Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class VisaCard implements PaymentMethod{
	
	private  String nameOnCard;
	private String cardNumber;
	private int cvv;
	private String expiryDate;	
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	
	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}	


	public abstract String getCardType();
	
	public void pay(double amount) {
		System.out.println(amount + " paid with visa " + getCardType());
	}
	
	public void paymentInformation() {
		try {
			
			System.out.print("Card Holder Name: ");
			nameOnCard = READER.readLine();
			
			System.out.print("Card Number: ");
			cardNumber = READER.readLine();
			
			System.out.print("Enter CVV: ");
			cvv = Short.parseShort(READER.readLine());
			
			System.out.print("Enter Card Expiry Date: ");
			expiryDate = READER.readLine();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
