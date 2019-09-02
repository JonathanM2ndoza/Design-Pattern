package com.jmendoza.springboot.builderpattern.impl;

import com.jmendoza.springboot.builderpattern.interfaz.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
