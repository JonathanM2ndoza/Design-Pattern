package com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Checkbox;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.macos.MacOSButton;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.macos.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
