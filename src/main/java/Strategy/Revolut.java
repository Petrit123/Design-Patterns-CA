package Strategy;

public class Revolut extends VisaCard {

	public Revolut(String nameOnCard, String cardNumber, int cvv, String expiryDate) {
	}

	@Override
	public String getCardType() {
		return "Revolut";
	}

}
