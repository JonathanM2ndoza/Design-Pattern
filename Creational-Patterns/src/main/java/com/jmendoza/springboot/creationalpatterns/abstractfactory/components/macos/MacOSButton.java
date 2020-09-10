package com.jmendoza.springboot.creationalpatterns.abstractfactory.components.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Button;

public class MacOSButton implements Button {
    @Override
    public String paint() {
        return "You have created MacOSButton.";
    }
}
