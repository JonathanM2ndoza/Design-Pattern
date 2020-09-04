package com.jmendoza.springboot.creationalpatterns.abstractfactory.factory;

import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.product.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
