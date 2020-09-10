package com.jmendoza.springboot.creationalpatterns.prototype.cache;

import com.jmendoza.springboot.creationalpatterns.prototype.shapes.Circle;
import com.jmendoza.springboot.creationalpatterns.prototype.shapes.Rectangle;
import com.jmendoza.springboot.creationalpatterns.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(7);
        circle.setRadius(45);
        circle.setColor("Green");

        Rectangle rectangle = new Rectangle();
        rectangle.setX(6);
        rectangle.setY(9);
        rectangle.setWidth(8);
        rectangle.setHeight(10);
        rectangle.setColor("Blue");

        put("big.green.circle", circle);
        put("medium.blue.rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
