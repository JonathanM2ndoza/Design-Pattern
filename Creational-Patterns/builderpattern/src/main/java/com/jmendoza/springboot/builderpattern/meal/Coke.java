package com.jmendoza.springboot.builderpattern.meal;

import com.jmendoza.springboot.builderpattern.abstractitem.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public Double price() {
        return 20.0;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
