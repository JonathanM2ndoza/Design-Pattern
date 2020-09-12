package com.jmendoza.springboot.structuralpatterns.facade.library.codec;

public class OggCompressionCodec implements Codec {
    private String type;

    public OggCompressionCodec() {
        this.type = "ogg";
    }

    @Override
    public String getType() {
        return type;
    }
}
