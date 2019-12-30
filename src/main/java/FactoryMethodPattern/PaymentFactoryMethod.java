package FactoryMethodPattern;

import Strategy.PaymentMethod;
import Entity.VisaEntity;
import Entity.PayPalEntity;

/**
 * 
 * @author Petrit Krasniqi
 * Implemented the Factory Method Pattern to get the payment method
 * type chosen by the user.
 */

public class PaymentFactoryMethod {
	
	public static final String PAY_BY_CASH = "PAY_BY_CASH";
	public static final String PAY_BY_CREDIT_CARD = "PAY_BY_CREDIT_CARD";
	public static final String PAY_BY_DEBIT_CARD = "PAY_BY_DEBIT_CARD";
	public static final String PAY_BY_REVOLUT_CARD = "PAY_BY_REVOLUT_CARD";
	public static final String PAY_BY_PAYPAL = "PAY_BY_PAYPAL";
	
    public PaymentMethod getPaymentMethod(String paymentMethod, Object paymentDetail) {
    	
        switch (paymentMethod) {
            case PAY_BY_CASH:
                return new Strategy.Cash();
            case PAY_BY_CREDIT_CARD:
            case PAY_BY_DEBIT_CARD:
            case PAY_BY_REVOLUT_CARD:
                VisaEntity entity = (VisaEntity) paymentDetail;
                // Validate input data
                if (entity.getNameOnCard() == null || entity.getCardNumber() == null || entity.getCvv() == 0 || entity.getExpiryDate() == null) {
                    return null;
                }
                if (paymentMethod.equals(PAY_BY_CREDIT_CARD)) {

                }

                if (paymentMethod.equals(PAY_BY_DEBIT_CARD)) {

                }

                if (paymentMethod.equals(PAY_BY_REVOLUT_CARD)) {

                }
            case PAY_BY_PAYPAL:
                PayPalEntity payPalEntity = (PayPalEntity) paymentDetail;
                if (payPalEntity.getUsername() == null || payPalEntity.getEmail() == null || payPalEntity.getPassword() == null) {
                    return null;
                }
            default:
                return null;
        }
    }
	
	

}
