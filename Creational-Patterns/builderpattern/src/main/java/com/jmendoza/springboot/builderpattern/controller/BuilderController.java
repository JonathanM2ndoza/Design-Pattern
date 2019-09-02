package com.jmendoza.springboot.builderpattern.controller;

import com.jmendoza.springboot.builderpattern.builder.MealBuilder;
import com.jmendoza.springboot.builderpattern.meal.Meal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 */

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @GetMapping
    public ResponseEntity builder(HttpServletRequest request) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
