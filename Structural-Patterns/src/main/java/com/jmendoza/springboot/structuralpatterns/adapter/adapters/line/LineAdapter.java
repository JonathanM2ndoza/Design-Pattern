package com.jmendoza.springboot.structuralpatterns.adapter.adapters.line;

import com.jmendoza.springboot.structuralpatterns.adapter.adapters.Shape;
import com.jmendoza.springboot.structuralpatterns.adapter.line.Line;

public class LineAdapter implements Shape {
    private Line adaptee;

    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
