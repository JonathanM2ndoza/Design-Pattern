package com.jmendoza.springboot.behavioralpatterns.strategy.strategies.paypal;

import com.jmendoza.springboot.behavioralpatterns.strategy.strategies.PayStrategy;

public class PayByPayPal implements PayStrategy {

    private int paymentAmount;

    public PayByPayPal(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public void pay() {
        verifyAccount();
        System.out.println("Paying " + paymentAmount + " using PayPal.");
    }

    private void verifyAccount() {
        System.out.println("PayPal verification has been successful.");
    }
}
