package com.jmendoza.springboot.builderpattern.abstractitem;

import com.jmendoza.springboot.builderpattern.impl.Bottle;
import com.jmendoza.springboot.builderpattern.interfaz.Item;
import com.jmendoza.springboot.builderpattern.interfaz.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Double price();
}
