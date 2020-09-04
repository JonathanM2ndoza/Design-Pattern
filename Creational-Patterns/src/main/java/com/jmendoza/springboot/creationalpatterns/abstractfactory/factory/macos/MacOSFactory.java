package com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.macos;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Checkbox;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.macos.MacOSButton;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.macos.MacOSCheckbox;

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
