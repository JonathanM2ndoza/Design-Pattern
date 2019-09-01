package com.jmendoza.springboot.facadepattern.impl;

import com.jmendoza.springboot.facadepattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("square")
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
