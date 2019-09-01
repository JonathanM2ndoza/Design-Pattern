package com.jmendoza.springboot.abstractfactory.impl;

import com.jmendoza.springboot.abstractfactory.interfaz.Shape;
import org.springframework.stereotype.Component;

@Component
public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
