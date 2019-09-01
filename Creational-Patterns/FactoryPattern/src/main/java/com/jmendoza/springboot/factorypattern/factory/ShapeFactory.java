package com.jmendoza.springboot.factorypattern.factory;

import com.jmendoza.springboot.factorypattern.impl.Circle;
import com.jmendoza.springboot.factorypattern.impl.Rectangle;
import com.jmendoza.springboot.factorypattern.impl.Square;
import com.jmendoza.springboot.factorypattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

    @Autowired
    Circle circle;
    @Autowired
    Rectangle rectangle;
    @Autowired
    Square square;

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return circle;

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return rectangle;

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return square;
        }
        return null;
    }
}
