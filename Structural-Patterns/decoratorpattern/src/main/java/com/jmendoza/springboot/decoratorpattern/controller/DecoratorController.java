package com.jmendoza.springboot.decoratorpattern.controller;


import com.jmendoza.springboot.decoratorpattern.decorator.RedShapeDecorator;
import com.jmendoza.springboot.decoratorpattern.interfaz.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
 */

@RestController
@RequestMapping("/decorator")
public class DecoratorController {

    @Autowired
    @Qualifier("circle")
    Shape circle;

    @Autowired
    @Qualifier("circle")
    Shape circle1;

    @Autowired
    @Qualifier("rectangle")
    Shape rectangle;


    @GetMapping
    public ResponseEntity decorator(HttpServletRequest request) {

        Shape redCircle = new RedShapeDecorator(circle1);

        Shape redRectangle = new RedShapeDecorator(rectangle);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        return new ResponseEntity("OK", HttpStatus.OK);
    }

}
