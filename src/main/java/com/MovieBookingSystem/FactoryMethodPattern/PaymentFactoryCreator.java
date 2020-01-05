package com.MovieBookingSystem.FactoryMethodPattern;

import com.MovieBookingSystem.Strategy.PaymentMethod;

public interface PaymentFactoryCreator {
	
	PaymentMethod getPaymentMethod(PaymentMethodType paymentMethodType);

}
