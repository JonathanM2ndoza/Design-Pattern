package com.jmendoza.springboot.singletonpattern;

public class SingletonPattern {
    private String name;
    private static SingletonPattern singleInstance = null;

    private SingletonPattern(String name) {
        //Initialize everything you need
        this.name = name;
    }

    public static SingletonPattern getInstance(String name) {
        if (singleInstance == null)
            singleInstance = new SingletonPattern(name);
        return singleInstance;
    }

    public void printName() {
        System.out.println("SingletonPattern: " + name);
    }
}
