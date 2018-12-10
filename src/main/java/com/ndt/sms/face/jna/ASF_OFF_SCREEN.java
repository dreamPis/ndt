package com.ndt.sms.face.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class ASF_OFF_SCREEN extends Structure {
    public int u32PixelArrayFormat;
    public int i32Width;
    public int i32Height;
    public Pointer[] ppu8Plane = new Pointer[4];
    public int[] pi32Pitch = new int[4];
    
    public ASF_OFF_SCREEN(){

    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("u32PixelArrayFormat", "i32Width", "i32Height", "ppu8Plane","pi32Pitch");
    }
}
