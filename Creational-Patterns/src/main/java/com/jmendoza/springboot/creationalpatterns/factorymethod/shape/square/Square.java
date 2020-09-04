package com.jmendoza.springboot.creationalpatterns.factorymethod.shape.square;

import com.jmendoza.springboot.creationalpatterns.factorymethod.shape.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape {

    private double area;
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void calculateArea() {
        area = length * length;
    }

    @Override
    public void sendArea() {
        log.debug("Area of a square: ", area);
    }

}
