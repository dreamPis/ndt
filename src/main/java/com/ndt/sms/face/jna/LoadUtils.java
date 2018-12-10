package com.ndt.sms.face.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @Author ser7en
 * @Date 2018-12-07 14:08
 * @version：
 * @Desc：
 */
public class LoadUtils {

    public static <T extends Library> T loadLibrary(String libName, Class<T> interfaceClass){
        return Native.load(libName, interfaceClass);
    }

}
