package com.jmendoza.springboot.builderpattern.impl;

import com.jmendoza.springboot.builderpattern.interfaz.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
