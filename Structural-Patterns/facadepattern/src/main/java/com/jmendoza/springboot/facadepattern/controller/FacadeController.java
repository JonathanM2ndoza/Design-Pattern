package com.jmendoza.springboot.facadepattern.controller;


import com.jmendoza.springboot.facadepattern.facade.ShapeMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Provide a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 */

@RestController
@RequestMapping("/facade")
public class FacadeController {

    @Autowired
    ShapeMaker shapeMaker;

    @GetMapping
    public ResponseEntity facade(HttpServletRequest request) {
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
