package com.ndt.sms.face.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Face extends Library {

    Face instance = Native.load("linux_x64/libarcsoft_face.so", Face.class);

}
