package com.jmendoza.springboot.creationalpatterns.factorypattern.factory;

import com.jmendoza.springboot.creationalpatterns.factorypattern.shape.Shape;
import com.jmendoza.springboot.creationalpatterns.factorypattern.shape.circle.Circle;
import com.jmendoza.springboot.creationalpatterns.factorypattern.shape.rectangle.Rectangle;
import com.jmendoza.springboot.creationalpatterns.factorypattern.shape.square.Square;
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
        if (shapeType == null)
            return null;

        switch (ShapeType.valueOf(shapeType)) {
            case CIRCLE:
                return circle;
            case RECTANGLE:
                return rectangle;
            case SQUARE:
                return square;
            default:
                return null;
        }
    }
}
