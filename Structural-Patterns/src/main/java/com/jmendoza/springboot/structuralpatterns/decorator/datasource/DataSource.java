package com.jmendoza.springboot.structuralpatterns.decorator.datasource;

public interface DataSource {
    void writeData(String data);

    String readData();
}
