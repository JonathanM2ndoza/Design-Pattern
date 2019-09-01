package com.jmendoza.springboot.abstractfactory.factory;

import com.jmendoza.springboot.abstractfactory.abstractfactory.AbstractFactory;
import com.jmendoza.springboot.abstractfactory.impl.Rectangle;
import com.jmendoza.springboot.abstractfactory.impl.Square;
import com.jmendoza.springboot.abstractfactory.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory extends AbstractFactory {

    @Autowired
    Rectangle rectangle;
    @Autowired
    Square Square;

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return rectangle;
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return Square;
        }
        return null;
    }
}