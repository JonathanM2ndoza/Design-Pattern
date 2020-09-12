package com.jmendoza.springboot.creationalpatterns.prototype.controller;

import com.jmendoza.springboot.creationalpatterns.prototype.cache.BundledShapeCache;
import com.jmendoza.springboot.creationalpatterns.prototype.shapes.Shape;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prototype")
public class PrototypeController {

    @GetMapping
    public ResponseEntity getPrototype() {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("big.green.circle");
        Shape shape2 = cache.get("medium.blue.rectangle");
        Shape shape3 = cache.get("medium.blue.rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("1-Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("2-Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("2.1-And they are identical (yay!)");
            } else {
                System.out.println("2.2-But they are not identical (booo!)");
            }
        } else {
            System.out.println("2.3-Rectangle objects are the same (booo!)");
        }

        return ResponseEntity.noContent().build();
    }
}
