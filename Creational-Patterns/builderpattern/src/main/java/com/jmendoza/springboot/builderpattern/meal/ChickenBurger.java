package com.jmendoza.springboot.builderpattern.meal;

import com.jmendoza.springboot.builderpattern.abstractitem.Burger;

public class ChickenBurger extends Burger {
    @Override
    public Double price() {
        return 24.5;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
