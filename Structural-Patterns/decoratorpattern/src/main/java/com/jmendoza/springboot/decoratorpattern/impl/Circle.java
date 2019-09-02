package com.jmendoza.springboot.decoratorpattern.impl;

import com.jmendoza.springboot.decoratorpattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("circle")
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}