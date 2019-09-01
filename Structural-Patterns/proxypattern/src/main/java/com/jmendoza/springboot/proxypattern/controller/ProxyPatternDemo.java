package com.jmendoza.springboot.proxypattern.controller;

import com.jmendoza.springboot.proxypattern.impl.ProxyImage;
import com.jmendoza.springboot.proxypattern.interfaz.Image;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Provide a surrogate or placeholder for another object to control access to it.
 */

@RestController
@RequestMapping("/proxy")
public class ProxyPatternDemo {

    @GetMapping(value = "/demo")
    public ResponseEntity getImage(HttpServletRequest request) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("===========");

        //image will not be loaded from disk
        image.display();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
