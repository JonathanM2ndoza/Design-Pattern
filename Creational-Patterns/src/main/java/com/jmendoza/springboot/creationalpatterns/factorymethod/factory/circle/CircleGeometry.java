package com.jmendoza.springboot.creationalpatterns.factorymethod.factory.circle;

import com.jmendoza.springboot.creationalpatterns.factorymethod.factory.Geometry;
import com.jmendoza.springboot.creationalpatterns.factorymethod.shape.Shape;
import com.jmendoza.springboot.creationalpatterns.factorymethod.shape.circle.Circle;

public class CircleGeometry extends Geometry {

    private double radius;

    public CircleGeometry(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new Circle(radius);
    }
}
