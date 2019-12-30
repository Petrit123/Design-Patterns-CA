package FactoryMethodPattern;

import Strategy.PaymentMethod;
import Strategy.VisaCard;
import Strategy.CreditCard;
import Strategy.PayPal;
import Strategy.DebitCard;

/**
 * 
 * @author Petrit Krasniqi
 * Implemented the Factory Method Pattern to get the payment method
 * type chosen by the user.
 */

public class PaymentFactoryMethod {
	
	private VisaCard visaCard;
	private PayPal payPal;
	
	public static final String PAY_BY_CASH = "PAY_BY_CASH";
	public static final String PAY_BY_CREDIT_CARD = "PAY_BY_CREDIT_CARD";
	public static final String PAY_BY_DEBIT_CARD = "PAY_BY_DEBIT_CARD";
	public static final String PAY_BY_REVOLUT_CARD = "PAY_BY_REVOLUT_CARD";
	public static final String PAY_BY_PAYPAL = "PAY_BY_PAYPAL";
	
    public PaymentMethod getPaymentMethod(String paymentMethod) {
    	
//        VisaCard visaCard = (VisaCard) paymentDetail;
    	
        switch (paymentMethod) {
            case PAY_BY_CASH:
                return new Strategy.Cash();
            case PAY_BY_CREDIT_CARD:
            	return payWithCreditCard();
            case PAY_BY_DEBIT_CARD:
            	return payWithDebitCard();
//            case PAY_BY_REVOLUT_CARD:
//            case PAY_BY_PAYPAL:
//                PayPal payPalEntity = (PayPal) paymentDetail;
//                if (payPalEntity.getUsername() == null || payPalEntity.getEmail() == null || payPalEntity.getPassword() == null) {
//                    return null;
//                }
            default:
                return null;
        }
        
    }
    
    public CreditCard payWithCreditCard() {
    	
    	visaCard.paymentInformation();
    	CreditCard creditCard = new CreditCard(visaCard.getNameOnCard(),visaCard.getCardNumber(),visaCard.getCvv(),visaCard.getExpiryDate());
    	return creditCard;
    }
    
    public DebitCard payWithDebitCard() {
    	
    	visaCard.paymentInformation();
    	DebitCard debitCard = new DebitCard(visaCard.getNameOnCard(),visaCard.getCardNumber(),visaCard.getCvv(),visaCard.getExpiryDate());
    	return debitCard;
    }
	
	

}
