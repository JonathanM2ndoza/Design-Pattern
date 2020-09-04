package com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.windows;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Checkbox;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.windows.WindowsButton;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
