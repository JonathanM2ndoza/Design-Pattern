package com.jmendoza.springboot.commandpattern.request;

public class Stock {
    private String name = "iPhone";
    private int quantity = 7;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
