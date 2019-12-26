package PaymentMethod;

public abstract class VisaCard implements PaymentMethod{
	
	private  String nameOnCard;
	private String cardNumber;
	private short cvv;
	private String expiryDate;
	
	public VisaCard(String nameOnCard, String cardNumber, short cvv, String expiryDate) {
		super();
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public void pay(double amount) {
		System.out.println(amount + " paid with credit card");
	}
	
	public abstract String getCardType();
	
}
