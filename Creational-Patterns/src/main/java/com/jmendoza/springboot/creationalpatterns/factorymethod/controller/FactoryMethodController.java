package com.jmendoza.springboot.creationalpatterns.factorymethod.controller;

import com.google.gson.JsonObject;
import com.jmendoza.springboot.creationalpatterns.factorymethod.factory.Geometry;
import com.jmendoza.springboot.creationalpatterns.factorymethod.factory.circle.CircleGeometry;
import com.jmendoza.springboot.creationalpatterns.factorymethod.factory.polygon.RectangleGeometry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory_method")
public class FactoryMethodController {

    @GetMapping
    public ResponseEntity getGeometry() {

        Geometry geometry = new CircleGeometry(5);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("circle", geometry.businessLogic());

        geometry = new RectangleGeometry(2, 4);
        jsonObject.addProperty("rectangle", geometry.businessLogic());

        return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
    }
}
