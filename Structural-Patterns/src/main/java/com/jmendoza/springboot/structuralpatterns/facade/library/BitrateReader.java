package com.jmendoza.springboot.structuralpatterns.facade.library;

import com.jmendoza.springboot.structuralpatterns.facade.library.codec.Codec;

public class BitrateReader {

    private BitrateReader() {
    }

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        System.out.println("VideoFile: " + file.getName() + " - CodecType: " + codec.getType());
        System.out.println("Codec: " + codec.getType());
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        System.out.println("buffer: " + buffer.getName() + " - CodecType: " + codec.getType());
        System.out.println("Codec: " + codec.getType());
        return buffer;
    }
}
