package com.jmendoza.springboot.creationalpatterns.simplefactory.factory;

import com.jmendoza.springboot.creationalpatterns.simplefactory.shape.Shape;
import com.jmendoza.springboot.creationalpatterns.simplefactory.shape.circle.Circle;
import com.jmendoza.springboot.creationalpatterns.simplefactory.shape.rectangle.Rectangle;
import com.jmendoza.springboot.creationalpatterns.simplefactory.shape.square.Square;
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
