package com.jmendoza.springboot.templatepattern.controller;

import com.jmendoza.springboot.templatepattern.template.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/template")
public class TemplateDemo {

    @Autowired
    @Qualifier("cricket")
    Game gameCricket;

    @Autowired
    @Qualifier("football")
    Game gameFootball;

    @GetMapping(value = "/demo")
    public ResponseEntity getShape(HttpServletRequest request) {

        gameCricket.play();
        System.out.println("==========================");
        gameFootball.play();

        return new ResponseEntity("OK", HttpStatus.OK);
    }

}
