package com.jmendoza.springboot.structuralpatterns.facade.library;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio... " + result.toString());
        return new File("tmp");
    }
}
