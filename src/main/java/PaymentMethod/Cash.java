package PaymentMethod;

public class Cash implements PaymentMethod{
	
	public void pay(double amount) {
		System.out.println(amount + " paid using cash");
	}

}
