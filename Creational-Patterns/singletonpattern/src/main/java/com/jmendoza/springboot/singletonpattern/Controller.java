package com.jmendoza.springboot.singletonpattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Ensure a class has only one instance, and provide a global point of access to it.
 */

@RestController
@RequestMapping("/singleton")
public class Controller {

    @GetMapping(value = "/demo")
    public ResponseEntity test(HttpServletRequest request) {

        SingletonPattern singletonPattern1 = SingletonPattern.getInstance("singletonPattern1");
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance("singletonPattern2");

        singletonPattern1.printName();
        singletonPattern2.printName();

        return new ResponseEntity("OK", HttpStatus.OK);

    }
}