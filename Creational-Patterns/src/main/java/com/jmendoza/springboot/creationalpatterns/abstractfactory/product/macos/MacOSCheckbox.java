package com.jmendoza.springboot.creationalpatterns.abstractfactory.product.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created MacOSCheckbox.";
    }
}
