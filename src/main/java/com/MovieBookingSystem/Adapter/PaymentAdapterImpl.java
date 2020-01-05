package com.MovieBookingSystem.Adapter;

import com.MovieBookingSystem.Strategy.PayPal;

public class PaymentAdapterImpl implements PaymentAdapter {

	private PayPal payPal;
	
	public PaymentAdapterImpl (PayPal payPal) {
		this.payPal = payPal;
	}
	
	@Override
	public void payment(double amount) {
		this.payPal.pay(amount);
		
	}
	

}
