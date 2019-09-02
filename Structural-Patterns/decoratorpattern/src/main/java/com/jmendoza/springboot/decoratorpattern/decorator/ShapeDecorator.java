package com.jmendoza.springboot.decoratorpattern.decorator;

import com.jmendoza.springboot.decoratorpattern.interfaz.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
