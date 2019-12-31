package com.MovieBookingSystem.FactoryMethodPattern;

import com.MovieBookingSystem.Strategy.*;
/**
 * 
 * @author Petrit Krasniqi
 * Implemented the Factory Method Pattern to get the payment method
 * type chosen by the user.
 */

public class PaymentFactoryMethod {
	
	private VisaCard visaCard = new CreditCard("","",0,"");
	private PayPal payPal = new PayPal("","","");
	private Cash cash = new Cash();
	
    public  PaymentMethod getPaymentMethod(PaymentMethodType paymentMethod) {
    	
    	PaymentMethod paymentMethodStrategy = null;
    	
        switch (paymentMethod) {
            case PAY_BY_CASH:
                paymentMethodStrategy = payWithCash();
                
            case PAY_BY_CREDIT_CARD:
                paymentMethodStrategy =payWithCreditCard();
                
            case PAY_BY_DEBIT_CARD:
                paymentMethodStrategy = payWithDebitCard();
                
            case PAY_BY_REVOLUT_CARD:
                paymentMethodStrategy =payWithRevolutCard();
                
            case PAY_BY_PAYPAL:
                paymentMethodStrategy = payWithPayPal();
                
            default:
                paymentMethodStrategy = null;
        }
        
        return paymentMethodStrategy;
        
    }
    
    public VisaCard payWithCreditCard() {
    	
    	visaCard.paymentInformation();
    	visaCard = new CreditCard(visaCard.getNameOnCard(),visaCard.getCardNumber(),visaCard.getCvv(),visaCard.getExpiryDate());
    	return visaCard;
    }
    
    public VisaCard payWithDebitCard() {
    	
    	visaCard.paymentInformation();
    	visaCard = new DebitCard(visaCard.getNameOnCard(),visaCard.getCardNumber(),visaCard.getCvv(),visaCard.getExpiryDate());
    	return visaCard;
    }
    
    public VisaCard payWithRevolutCard() {
    	
    	visaCard.paymentInformation();
    	visaCard = new Revolut(visaCard.getNameOnCard(),visaCard.getCardNumber(),visaCard.getCvv(),visaCard.getExpiryDate());
    	return visaCard;
    }
    
    
    public Cash payWithCash() {

    	cash.paymentInformation();
    	return cash;
    }
    
    public PayPal payWithPayPal() {
    	
    	payPal.paymentInformation();
    	payPal = new PayPal(payPal.getUsername(),payPal.getEmail(),payPal.getPassword());
    	return payPal;
    }
	
	

}
