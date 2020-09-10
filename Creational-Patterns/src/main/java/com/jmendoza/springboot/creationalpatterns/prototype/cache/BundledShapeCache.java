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
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

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
