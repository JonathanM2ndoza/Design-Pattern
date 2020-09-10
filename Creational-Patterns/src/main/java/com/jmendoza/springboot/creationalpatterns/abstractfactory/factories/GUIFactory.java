package com.jmendoza.springboot.creationalpatterns.abstractfactory.factories;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
