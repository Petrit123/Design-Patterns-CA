package FactoryMethodPattern;

import Strategy.*;
/**
 * 
 * @author Petrit Krasniqi
 * Implemented the Factory Method Pattern to get the payment method
 * type chosen by the user.
 */

public class PaymentFactoryMethod {
	
	private VisaCard visaCard = new CreditCard("as","as",12,"as");
	private PayPal payPal = new PayPal("","","");
	private Cash cash = new Cash();
	
	public static final String PAY_BY_CASH = "PAY_BY_CASH";
	public static final String PAY_BY_CREDIT_CARD = "PAY_BY_CREDIT_CARD";
	public static final String PAY_BY_DEBIT_CARD = "PAY_BY_DEBIT_CARD";
	public static final String PAY_BY_REVOLUT_CARD = "PAY_BY_REVOLUT_CARD";
	public static final String PAY_BY_PAYPAL = "PAY_BY_PAYPAL";
	
    public  PaymentMethod getPaymentMethod(String paymentMethod) {
    	
//        VisaCard visaCard = (VisaCard) paymentDetail;
    	
        switch (paymentMethod) {
            case PAY_BY_CASH:
                return payWithCash();
            case PAY_BY_CREDIT_CARD:
            	return payWithCreditCard();
            case PAY_BY_DEBIT_CARD:
            	return payWithDebitCard();
            case PAY_BY_REVOLUT_CARD:
            	return payWithRevolutCard();
            case PAY_BY_PAYPAL:
            	return payWithPayPal();
            default:
                return null;
        }
        
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
