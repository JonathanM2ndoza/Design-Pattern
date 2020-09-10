package com.jmendoza.springboot.creationalpatterns.singleton;

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
public class SingletonController {

    @GetMapping
    public ResponseEntity getSingleton(HttpServletRequest request) {

        SingletonPattern singletonPattern1 = SingletonPattern.getInstance("singletonPattern1");
        SingletonPattern singletonPattern2 = SingletonPattern.getInstance("singletonPattern2");

        singletonPattern1.printValue();
        singletonPattern2.printValue();

        return ResponseEntity.noContent().build();

    }
}
