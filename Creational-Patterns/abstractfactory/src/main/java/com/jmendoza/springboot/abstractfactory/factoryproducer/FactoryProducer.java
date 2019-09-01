package com.jmendoza.springboot.abstractfactory.factoryproducer;

import com.jmendoza.springboot.abstractfactory.abstractfactory.AbstractFactory;
import com.jmendoza.springboot.abstractfactory.factory.RoundedShapeFactory;
import com.jmendoza.springboot.abstractfactory.factory.ShapeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryProducer {

    @Autowired
    RoundedShapeFactory roundedShapeFactory;
    @Autowired
    ShapeFactory shapeFactory;

    public AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return roundedShapeFactory;
        } else {
            return shapeFactory;
        }
    }
}