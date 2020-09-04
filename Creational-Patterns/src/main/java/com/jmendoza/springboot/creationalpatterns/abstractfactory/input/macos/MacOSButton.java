package com.jmendoza.springboot.creationalpatterns.abstractfactory.input.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Button;

public class MacOSButton implements Button {
    @Override
    public String paint() {
        return "You have created MacOSButton.";
    }
}
