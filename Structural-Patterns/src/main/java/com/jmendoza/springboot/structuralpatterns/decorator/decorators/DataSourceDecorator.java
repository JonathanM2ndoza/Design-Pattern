package com.jmendoza.springboot.structuralpatterns.decorator.decorators;

import com.jmendoza.springboot.structuralpatterns.decorator.datasource.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
