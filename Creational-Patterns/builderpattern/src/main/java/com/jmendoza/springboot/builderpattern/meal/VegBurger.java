package com.jmendoza.springboot.builderpattern.meal;

import com.jmendoza.springboot.builderpattern.abstractitem.Burger;

public class VegBurger extends Burger {
    @Override
    public Double price() {
        return 12.0;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
