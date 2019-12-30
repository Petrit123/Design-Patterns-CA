package Strategy;

public class Cash implements Strategy.PaymentMethod {
	
	public void pay(double amount) {
		System.out.println(amount + " paid using cash");
	}
	
	public void paymentInformation() {
		System.out.print("Thank you! ");
	}

}
