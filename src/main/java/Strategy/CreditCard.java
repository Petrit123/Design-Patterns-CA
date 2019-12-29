package Strategy;

public class CreditCard extends VisaCard {

	public CreditCard(String nameOnCard, String cardNumber, short cvv, String expiryDate) {
		super(nameOnCard, cardNumber, cvv, expiryDate);
	}

	@Override
	public String getCardType() {
		return "Credit Card";
	}

}
