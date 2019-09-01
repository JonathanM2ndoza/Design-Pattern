package com.jmendoza.springboot.abstractfactory.abstractfactory;

import com.jmendoza.springboot.abstractfactory.interfaz.Shape;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
