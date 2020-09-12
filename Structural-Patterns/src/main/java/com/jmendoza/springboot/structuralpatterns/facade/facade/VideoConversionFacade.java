package com.jmendoza.springboot.structuralpatterns.facade.facade;

import com.jmendoza.springboot.structuralpatterns.facade.library.AudioMixer;
import com.jmendoza.springboot.structuralpatterns.facade.library.BitrateReader;
import com.jmendoza.springboot.structuralpatterns.facade.library.VideoFile;
import com.jmendoza.springboot.structuralpatterns.facade.library.codec.Codec;
import com.jmendoza.springboot.structuralpatterns.facade.library.codec.MPEG4CompressionCodec;
import com.jmendoza.springboot.structuralpatterns.facade.library.codec.OggCompressionCodec;
import com.jmendoza.springboot.structuralpatterns.facade.library.factory.CodecFactory;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
