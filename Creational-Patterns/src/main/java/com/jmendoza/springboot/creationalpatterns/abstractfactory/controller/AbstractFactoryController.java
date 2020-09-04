package com.jmendoza.springboot.creationalpatterns.abstractfactory.controller;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.macos.MacOSFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.windows.WindowsFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.service.Application;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstract_factory")
public class AbstractFactoryController {

    @GetMapping("/{os_name}")
    public ResponseEntity getShape(@PathVariable("os_name") String osName) {

        Application application;
        GUIFactory guiFactory;
        String osName1 = osName.toLowerCase();
        if (osName1.contains("mac")) {
            guiFactory = new MacOSFactory();
            application = new Application(guiFactory);
        } else {
            guiFactory = new WindowsFactory();
            application = new Application(guiFactory);
        }

        return new ResponseEntity(application.businessLogic(), HttpStatus.OK);
    }
}
