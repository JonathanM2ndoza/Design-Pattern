package com.jmendoza.springboot.creationalpatterns.abstractfactory.product.windows;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created WindowsCheckbox.";
    }
}
