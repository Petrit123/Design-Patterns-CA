package Strategy;

public class Revolut extends VisaCard {

	public Revolut(String nameOnCard, String cardNumber, short cvv, String expiryDate) {
		super(nameOnCard, cardNumber, cvv, expiryDate);	
	}

	@Override
	public String getCardType() {
		return "Revolut";
	}

}
