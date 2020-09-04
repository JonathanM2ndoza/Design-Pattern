package com.jmendoza.springboot.creationalpatterns.factorymethod.shape.circle;

import com.jmendoza.springboot.creationalpatterns.factorymethod.shape.Shape;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Shape {

    private double area;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void calculateArea() {
        double area1 = Math.PI * radius * radius;
        area = Math.round(area1 * 100.0) / 100.0;
    }

    @Override
    public void sendArea() {
        log.debug("Area of a Circle: ", area);
    }
}
