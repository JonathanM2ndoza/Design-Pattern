package com.jmendoza.springboot.creationalpatterns.builder.director;

import com.jmendoza.springboot.creationalpatterns.builder.builders.Builder;
import com.jmendoza.springboot.creationalpatterns.builder.cars.Type;
import com.jmendoza.springboot.creationalpatterns.builder.components.Engine;
import com.jmendoza.springboot.creationalpatterns.builder.components.GPSNavigator;
import com.jmendoza.springboot.creationalpatterns.builder.components.Transmission;
import com.jmendoza.springboot.creationalpatterns.builder.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
