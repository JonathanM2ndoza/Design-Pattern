package com.jmendoza.springboot.commandpattern.impl;

import com.jmendoza.springboot.commandpattern.interfaz.Order;
import com.jmendoza.springboot.commandpattern.request.Stock;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
