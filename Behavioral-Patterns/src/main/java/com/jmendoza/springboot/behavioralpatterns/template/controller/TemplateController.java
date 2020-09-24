package com.jmendoza.springboot.behavioralpatterns.template.controller;

import com.jmendoza.springboot.behavioralpatterns.template.template.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 */

@RestController
@RequestMapping("/template")
public class TemplateController {

    @Autowired
    @Qualifier("cricket")
    Game gameCricket;

    @Autowired
    @Qualifier("football")
    Game gameFootball;

    @GetMapping
    public ResponseEntity getTemplate() {

        System.out.println("============cricket==============");
        gameCricket.play();
        System.out.println("============football=============");
        gameFootball.play();

        return ResponseEntity.noContent().build();
    }

}
