package com.jmendoza.springboot.creationalpatterns.builder.controller;

import com.google.gson.JsonObject;
import com.jmendoza.springboot.creationalpatterns.builder.builders.CarBuilder;
import com.jmendoza.springboot.creationalpatterns.builder.builders.CarManualBuilder;
import com.jmendoza.springboot.creationalpatterns.builder.cars.Car;
import com.jmendoza.springboot.creationalpatterns.builder.cars.Manual;
import com.jmendoza.springboot.creationalpatterns.builder.director.Director;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @GetMapping
    public ResponseEntity getBuilder() {

        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("carType", car.getType().name());

        return ResponseEntity.ok().body(jsonObject.toString());
    }
}
