package com.jmendoza.springboot.creationalpatterns.abstractfactory.components.windows;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created WindowsCheckbox.";
    }
}
