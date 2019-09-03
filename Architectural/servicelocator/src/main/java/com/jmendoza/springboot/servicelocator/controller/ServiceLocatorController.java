package com.jmendoza.springboot.servicelocator.controller;

import com.jmendoza.springboot.servicelocator.interfaz.Service;
import com.jmendoza.springboot.servicelocator.servicelocator.ServiceLocator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/servicelocator")
public class ServiceLocatorController {

    @GetMapping
    public ResponseEntity serviceLocator(HttpServletRequest request) {

        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
