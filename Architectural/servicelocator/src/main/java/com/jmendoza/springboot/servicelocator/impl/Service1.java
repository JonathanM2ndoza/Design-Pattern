package com.jmendoza.springboot.servicelocator.impl;

import com.jmendoza.springboot.servicelocator.interfaz.Service;

public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
