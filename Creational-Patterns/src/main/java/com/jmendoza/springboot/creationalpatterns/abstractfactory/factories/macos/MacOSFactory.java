package com.jmendoza.springboot.creationalpatterns.abstractfactory.factories.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.factories.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Checkbox;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.macos.MacOSButton;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.macos.MacOSCheckbox;

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
