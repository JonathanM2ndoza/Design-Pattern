package com.jmendoza.springboot.creationalpatterns.abstractfactory.input.windows;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created WindowsCheckbox.";
    }
}
