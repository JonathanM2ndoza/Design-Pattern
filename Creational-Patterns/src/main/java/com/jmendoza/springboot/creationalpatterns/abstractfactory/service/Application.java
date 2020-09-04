package com.jmendoza.springboot.creationalpatterns.abstractfactory.service;

import com.google.gson.JsonObject;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.factory.GUIFactory;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Button;
import com.jmendoza.springboot.creationalpatterns.abstractfactory.input.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
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
