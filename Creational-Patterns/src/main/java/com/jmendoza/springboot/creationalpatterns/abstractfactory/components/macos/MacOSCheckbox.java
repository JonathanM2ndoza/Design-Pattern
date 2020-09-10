package com.jmendoza.springboot.creationalpatterns.abstractfactory.components.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created MacOSCheckbox.";
    }
}
