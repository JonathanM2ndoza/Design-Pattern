package com.jmendoza.springboot.structuralpatterns.facade.library.factory;

import com.jmendoza.springboot.structuralpatterns.facade.library.VideoFile;
import com.jmendoza.springboot.structuralpatterns.facade.library.codec.Codec;
import com.jmendoza.springboot.structuralpatterns.facade.library.codec.MPEG4CompressionCodec;
import com.jmendoza.springboot.structuralpatterns.facade.library.codec.OggCompressionCodec;

public class CodecFactory {

    private CodecFactory() {
    }

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
