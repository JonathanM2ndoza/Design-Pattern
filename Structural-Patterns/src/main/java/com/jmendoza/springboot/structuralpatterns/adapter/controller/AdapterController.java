package com.jmendoza.springboot.structuralpatterns.adapter.controller;

import com.jmendoza.springboot.structuralpatterns.adapter.adapters.Shape;
import com.jmendoza.springboot.structuralpatterns.adapter.adapters.line.LineAdapter;
import com.jmendoza.springboot.structuralpatterns.adapter.adapters.rectangle.RectangleAdapter;
import com.jmendoza.springboot.structuralpatterns.adapter.line.Line;
import com.jmendoza.springboot.structuralpatterns.adapter.rectangle.Rectangle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @GetMapping
    public ResponseEntity getAdapter() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RectangleAdapter(new Rectangle()));
        shapes.add(new LineAdapter(new Line()));

        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;

        shapes.forEach(shape -> shape.draw(x1, y1, x2, y2));

        return ResponseEntity.noContent().build();
    }
}
