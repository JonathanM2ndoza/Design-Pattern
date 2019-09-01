package com.jmendoza.springboot.abstractfactory.factory;

import com.jmendoza.springboot.abstractfactory.abstractfactory.AbstractFactory;
import com.jmendoza.springboot.abstractfactory.impl.RoundedRectangle;
import com.jmendoza.springboot.abstractfactory.impl.RoundedSquare;
import com.jmendoza.springboot.abstractfactory.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoundedShapeFactory extends AbstractFactory {

    @Autowired
    RoundedRectangle roundedRectangle;
    @Autowired
    RoundedSquare roundedSquare;

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return roundedRectangle;
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return roundedSquare;
        }
        return null;
    }
}