package com.jmendoza.springboot.servicelocator.servicelocator;

import com.jmendoza.springboot.servicelocator.cache.Cache;
import com.jmendoza.springboot.servicelocator.context.InitialContext;
import com.jmendoza.springboot.servicelocator.interfaz.Service;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}