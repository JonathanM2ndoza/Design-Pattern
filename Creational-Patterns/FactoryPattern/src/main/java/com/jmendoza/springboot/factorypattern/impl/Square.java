package com.jmendoza.springboot.factorypattern.impl;

import com.jmendoza.springboot.factorypattern.interfaz.Shape;
import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}