package Strategy;

public class PayPal implements PaymentMethod{
	
	String username;
	String email;
	String password;
	
	public PayPal(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public void pay(double amount) {
		System.out.println(amount + " paid using PayPal");
	}

}
