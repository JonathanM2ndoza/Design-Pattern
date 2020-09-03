package com.jmendoza.springboot.factorypattern.shape.square;

import com.jmendoza.springboot.factorypattern.shape.Shape;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Square implements Shape {
    @Override
    public String draw() {
        return "Inside Square::draw() method.";
    }
}
