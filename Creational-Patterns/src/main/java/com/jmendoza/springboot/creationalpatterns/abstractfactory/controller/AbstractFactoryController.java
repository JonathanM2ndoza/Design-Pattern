package com.jmendoza.springboot.creationalpatterns.abstractfactory.controller;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.factories.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.factories.macos.MacOSFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.factories.windows.WindowsFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.service.FactoryService;
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

        FactoryService factoryService;
        GUIFactory guiFactory;
        String osName1 = osName.toLowerCase();
        if (osName1.contains("mac")) {
            guiFactory = new MacOSFactory();
            factoryService = new FactoryService(guiFactory);
        } else {
            guiFactory = new WindowsFactory();
            factoryService = new FactoryService(guiFactory);
        }

        return new ResponseEntity(factoryService.businessLogic(), HttpStatus.OK);
    }
}
