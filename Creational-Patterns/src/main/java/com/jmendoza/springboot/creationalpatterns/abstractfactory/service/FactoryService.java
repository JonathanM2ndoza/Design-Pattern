package com.jmendoza.springboot.creationalpatterns.abstractfactory.service;

import com.google.gson.JsonObject;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.factories.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.components.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class FactoryService {

    private Button button;
    private Checkbox checkbox;

    public FactoryService(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public String businessLogic() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("button", button.paint());
        jsonObject.addProperty("checkbox", checkbox.paint());

        return jsonObject.toString();
    }
}
