package Strategy;

public class CreditCard extends VisaCard {

	public CreditCard(String nameOnCard, String cardNumber, int cvv, String expiryDate) {
	}

	@Override
	public String getCardType() {
		return "Credit Card";
	}

}
