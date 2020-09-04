package com.jmendoza.springboot.creationalpatterns.abstractfactory.product.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Button;

public class MacOSButton implements Button {
    @Override
    public String paint() {
        return "You have created MacOSButton.";
    }
}
