package com.jmendoza.springboot.structuralpatterns.facade.library;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf('.') + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "VideoFile{" +
                "name='" + name + '\'' +
                ", codecType='" + codecType + '\'' +
                '}';
    }
}
