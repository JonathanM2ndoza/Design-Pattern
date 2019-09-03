package com.jmendoza.springboot.servicelocator.cache;

import com.jmendoza.springboot.servicelocator.interfaz.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName) {

        Service service1 = services.stream().filter(service -> serviceName.equals(service.getName())).findFirst().orElse(null);

        if (service1 != null)
            System.out.println("Returning cached  " + serviceName + " object");

        return service1;
    }

    public void addService(Service newService) {

        boolean isPresent = services.stream().filter(service -> newService.equals(service.getName())).findFirst().isPresent();

        if (!isPresent)
            services.add(newService);
    }
}