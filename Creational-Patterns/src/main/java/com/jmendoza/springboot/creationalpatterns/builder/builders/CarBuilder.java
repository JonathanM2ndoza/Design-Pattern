package com.jmendoza.springboot.creationalpatterns.builder.builders;

import com.jmendoza.springboot.creationalpatterns.builder.cars.Car;
import com.jmendoza.springboot.creationalpatterns.builder.cars.Type;
import com.jmendoza.springboot.creationalpatterns.builder.components.Engine;
import com.jmendoza.springboot.creationalpatterns.builder.components.GPSNavigator;
import com.jmendoza.springboot.creationalpatterns.builder.components.Transmission;
import com.jmendoza.springboot.creationalpatterns.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
