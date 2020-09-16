package com.jmendoza.springboot.behavioralpatterns.strategy.context;

import com.jmendoza.springboot.behavioralpatterns.strategy.strategies.PayStrategy;

public class Order {

    public void processOrder(PayStrategy strategy) {
        strategy.pay();
        // Here we could collect and store payment data from the strategy.
    }
}
