package com.jmendoza.springboot.structuralpatterns.facade.controller;

import com.jmendoza.springboot.structuralpatterns.facade.facade.VideoConversionFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/facade")
public class FacadeController {

    @GetMapping
    public ResponseEntity getFacade() {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println("Converted file: " + mp4Video);

        return ResponseEntity.noContent().build();
    }
}
