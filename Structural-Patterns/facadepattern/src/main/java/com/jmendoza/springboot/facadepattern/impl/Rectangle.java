package com.jmendoza.springboot.facadepattern.impl;

import com.jmendoza.springboot.facadepattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rectangle")
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
