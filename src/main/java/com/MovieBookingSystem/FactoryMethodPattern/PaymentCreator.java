package com.MovieBookingSystem.FactoryMethodPattern;

public abstract class PaymentCreator {
	
	abstract void createPaymentMethod(PaymentMethodType paymentMethodType);

}
