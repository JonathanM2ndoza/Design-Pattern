package com.jmendoza.springboot.creationalpatterns.factorymethod.shape.rectangle;

import com.jmendoza.springboot.creationalpatterns.factorymethod.shape.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {

    private double area;
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void calculateArea() {
        area = length * breadth;
    }

    @Override
    public void sendArea() {
        log.debug("Area of a Rectangle: ", area);
    }
}
