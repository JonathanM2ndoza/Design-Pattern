package com.jmendoza.springboot.builderpattern.abstractitem;

import com.jmendoza.springboot.builderpattern.impl.Wrapper;
import com.jmendoza.springboot.builderpattern.interfaz.Item;
import com.jmendoza.springboot.builderpattern.interfaz.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract Double price();

}
