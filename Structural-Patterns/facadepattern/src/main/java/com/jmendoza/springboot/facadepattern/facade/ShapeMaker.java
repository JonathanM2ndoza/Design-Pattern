package com.jmendoza.springboot.facadepattern.facade;

import com.jmendoza.springboot.facadepattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeMaker {

    @Autowired
    @Qualifier("circle")
    private Shape circle;

    @Autowired
    @Qualifier("rectangle")
    private Shape rectangle;

    @Autowired
    @Qualifier("square")
    private Shape square;

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
