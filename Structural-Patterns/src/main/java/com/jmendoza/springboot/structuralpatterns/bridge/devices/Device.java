package com.jmendoza.springboot.structuralpatterns.bridge.devices;

/**
 * Device classes act as implementation
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
