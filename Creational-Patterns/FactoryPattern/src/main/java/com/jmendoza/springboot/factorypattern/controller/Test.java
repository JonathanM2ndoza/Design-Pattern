package com.jmendoza.springboot.factorypattern.controller;

import com.jmendoza.springboot.factorypattern.factory.ShapeFactory;
import com.jmendoza.springboot.factorypattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Define an interface for creating a single object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */

@RestController
@RequestMapping("/factory")
public class Test {

    @Autowired
    ShapeFactory shapeFactory;

    @GetMapping(value = "/shape")
    public ResponseEntity getShape(HttpServletRequest request) {

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
