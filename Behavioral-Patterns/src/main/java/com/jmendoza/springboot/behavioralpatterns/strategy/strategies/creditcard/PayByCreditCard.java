package com.jmendoza.springboot.behavioralpatterns.strategy.strategies.creditcard;

import com.jmendoza.springboot.behavioralpatterns.strategy.strategies.PayStrategy;

public class PayByCreditCard implements PayStrategy {

    private int paymentAmount;

    public PayByCreditCard(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public void pay() {
        verifyCreditCard();
        System.out.println("Paying " + paymentAmount + " using Credit Card.");
    }

    private void verifyCreditCard() {
        System.out.println("Credit Card verification has been successful.");
    }
}
