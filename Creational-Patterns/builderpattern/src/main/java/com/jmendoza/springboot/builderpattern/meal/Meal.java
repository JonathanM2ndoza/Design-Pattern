package com.jmendoza.springboot.builderpattern.meal;

import com.jmendoza.springboot.builderpattern.interfaz.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public Double getCost() {
        return items.isEmpty() ? 0.0 : items.stream().mapToDouble(x -> x.price()).sum();
    }

    public void showItems() {
        items.forEach(x -> {
            System.out.print("Item : " + x.name());
            System.out.print(", Packing : " + x.packing().pack());
            System.out.println(", Price : " + x.price());
        });
    }
}
