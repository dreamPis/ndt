package com.ndt.sms.face.jna;

import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.PointerByReference;

/**
 * @Author ser7en
 * @Date 2018-12-07 14:39
 * @version：
 * @Desc：
 */
public interface FaceEngine extends Library {

    Face FACE = Face.instance;
    FaceEngine instance = LoadUtils.loadLibrary("linux_x64/libarcsoft_face_engine.so", FaceEngine.class);

    NativeLong ASFActivation(String appId, String sdkKye);
    NativeLong ASFInitEngine(long detectMode, int detectFaceOrientPriority, int detectFaceScaleVal, int detectFaceMaxNum, long combinedMask, PointerByReference hEngine);
    NativeLong ASFDetectFaces(Pointer hEngine, int width, int height, int format, ByteByReference imgData, ASF_MultiFaceInfo detectedFaces);
}
