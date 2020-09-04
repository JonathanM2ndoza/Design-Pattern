package com.jmendoza.springboot.creationalpatterns.simplefactory.shape.rectangle;

import com.jmendoza.springboot.creationalpatterns.simplefactory.shape.Shape;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Inside Rectangle::draw() method.";
    }
}
