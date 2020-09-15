package com.jmendoza.springboot.structuralpatterns.bridge.remotes.advanced;

import com.jmendoza.springboot.structuralpatterns.bridge.devices.Device;
import com.jmendoza.springboot.structuralpatterns.bridge.remotes.basic.BasicRemote;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
