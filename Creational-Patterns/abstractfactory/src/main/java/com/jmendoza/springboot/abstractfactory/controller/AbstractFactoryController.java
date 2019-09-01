package com.jmendoza.springboot.abstractfactory.controller;

import com.jmendoza.springboot.abstractfactory.abstractfactory.AbstractFactory;
import com.jmendoza.springboot.abstractfactory.factoryproducer.FactoryProducer;
import com.jmendoza.springboot.abstractfactory.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 */

@RestController
@RequestMapping("/abstractfactory")
public class AbstractFactoryController {

    @Autowired
    FactoryProducer factoryProducer;

    @GetMapping
    public ResponseEntity abstractFactory(HttpServletRequest request) {

        System.out.println("===================ShapeFactory============================");
        AbstractFactory shapeFactory = factoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        System.out.println("===================RoundedShapeFactory=====================");

        AbstractFactory roundedShapeFactory = factoryProducer.getFactory(true);
        Shape shape3 = roundedShapeFactory.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = roundedShapeFactory.getShape("SQUARE");
        shape4.draw();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
