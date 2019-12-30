package Strategy;

public class DebitCard extends VisaCard {

	public DebitCard(String nameOnCard, String cardNumber, int cvv, String expiryDate) {
	}

	@Override
	public String getCardType() {
		return "Debit Card";
	}

}
