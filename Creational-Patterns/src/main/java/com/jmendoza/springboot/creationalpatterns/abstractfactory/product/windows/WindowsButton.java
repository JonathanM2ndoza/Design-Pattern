package com.jmendoza.springboot.creationalpatterns.abstractfactory.product.windows;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Button;

public class WindowsButton implements Button {
    @Override
    public String paint() {
        return "You have created WindowsButton.";
    }
}
