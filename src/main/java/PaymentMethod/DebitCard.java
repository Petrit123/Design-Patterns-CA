package PaymentMethod;

public class DebitCard extends VisaCard{

	public DebitCard(String nameOnCard, String cardNumber, short cvv, String expiryDate) {
		super(nameOnCard, cardNumber, cvv, expiryDate);
	}

	@Override
	public String getCardType() {
		return "Debit Card";
	}

}
