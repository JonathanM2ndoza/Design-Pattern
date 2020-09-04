package com.jmendoza.springboot.creationalpatterns.abstractfactory.input.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created MacOSCheckbox.";
    }
}
