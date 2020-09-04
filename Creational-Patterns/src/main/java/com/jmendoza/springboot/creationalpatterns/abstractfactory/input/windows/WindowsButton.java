package com.jmendoza.springboot.creationalpatterns.abstractfactory.input.windows;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Button;

public class WindowsButton implements Button {
    @Override
    public String paint() {
        return "You have created WindowsButton.";
    }
}
