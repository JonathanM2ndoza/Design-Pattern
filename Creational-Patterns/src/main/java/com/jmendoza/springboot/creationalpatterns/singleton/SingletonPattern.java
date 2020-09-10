package com.jmendoza.springboot.creationalpatterns.singleton;

public class SingletonPattern {
    private String value;
    private static SingletonPattern singleInstance = null;

    private SingletonPattern(String value) {
        this.value = value;
    }

    public static SingletonPattern getInstance(String value) {
        if (singleInstance == null)
            singleInstance = new SingletonPattern(value);
        return singleInstance;
    }

    public void printValue() {
        System.out.println("SingletonPattern: " + value);
    }
}
