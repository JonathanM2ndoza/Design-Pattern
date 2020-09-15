package com.jmendoza.springboot.behavioralpatterns.observer.conroller;


import com.jmendoza.springboot.behavioralpatterns.observer.editor.Editor;
import com.jmendoza.springboot.behavioralpatterns.observer.listeners.email.EmailNotificationListener;
import com.jmendoza.springboot.behavioralpatterns.observer.listeners.log.LogOpenListener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/observer")
public class ObserverController {

    @GetMapping
    public ResponseEntity getObserver() {

        Editor editor = new Editor();
        editor.getEvents().subscribe("open", new LogOpenListener("out/log.txt", "Log Listener 1"));
        editor.getEvents().subscribe("open", new LogOpenListener("out/log.txt", "Log Listener 2"));
        editor.getEvents().subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("out/test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.noContent().build();
    }

}
