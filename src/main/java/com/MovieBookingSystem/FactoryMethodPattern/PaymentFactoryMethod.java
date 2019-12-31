package com.MovieBookingSystem.FactoryMethodPattern;

import com.MovieBookingSystem.Strategy.*;
/**
 * 
 * @author Petrit Krasniqi
 * Implemented the Factory Method Pattern to get the payment method
 * type chosen by the user.
 */

public class PaymentFactoryMethod {
		
    public  PaymentMethod getPaymentMethod(PaymentMethodType paymentMethod) {
    	
    	PaymentMethod paymentMethodStrategy = null;
    	
        switch (paymentMethod) {
            case PAY_BY_CASH:
                return new Cash();
                
            case PAY_BY_CREDIT_CARD:
                return new CreditCard();
                
            case PAY_BY_DEBIT_CARD:
                return new DebitCard();
                
            case PAY_BY_REVOLUT_CARD:
                return new Revolut();
                
            case PAY_BY_PAYPAL:
                 return new PayPal();
                
            default:
                return null;
        }
        
        
    }
    
    

	
	

}
