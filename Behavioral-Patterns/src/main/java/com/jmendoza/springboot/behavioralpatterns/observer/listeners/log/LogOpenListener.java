package com.jmendoza.springboot.behavioralpatterns.observer.listeners.log;

import com.jmendoza.springboot.behavioralpatterns.observer.listeners.EventListener;

import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;
    private String listenerName;

    public LogOpenListener(String fileName, String listenerName) {
        this.log = new File(fileName);
        this.listenerName = listenerName;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("listenerName: " + listenerName + " Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
