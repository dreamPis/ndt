package com.ndt.sms.controller;

import com.ndt.sms.common.Constants;
import com.ndt.sms.face.jna.*;
import com.sun.jna.Memory;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ByteByReference;
import com.sun.jna.ptr.PointerByReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @Author ser7en
 * @Date 2018-12-07 16:38
 * @version：
 * @Desc：
 */
@Slf4j
@RestController
public class FaceController {

    @GetMapping("/face")
    public String arcFace(){
        NativeLong ret = FaceEngine.instance.ASFActivation(Constants.APP_ID, Constants.SDK_KEY);
        if(ret.longValue() != 0 && ret.longValue() != 90114){
            log.error("activation error........................");
        }
        PointerByReference reference = new PointerByReference();
        int mask = ASF_DETECT.ASF_AGE.getCode() | ASF_DETECT.ASF_FACE_DETECT.getCode() |
                ASF_DETECT.ASF_FACERECOGNITION.getCode() | ASF_DETECT.ASF_GENDER.getCode() |
                ASF_DETECT.ASF_NONE.getCode();
        ret = FaceEngine.instance.ASFInitEngine(ASF_DETECT_MODE.ASF_DETECT_MODE_IMAGE.getCode(),
                ArcSoftFace_OrientPriority.ASF_OP_0_HIGHER_EXT.getCode(), 16, 1,
                mask, reference);
        if(ret.longValue() != 0){
            log.error("init error..............................");
        }
        Pointer pointer = reference.getPointer();
        File file;
        int width = -1;
        int height = -1;
        PointerByReference byReference = new PointerByReference();
        ASF_MultiFaceInfo faceInfo = new ASF_MultiFaceInfo.ByReference(byReference.getValue());
        try {
            file = ResourceUtils.getFile("classpath:1.jpg");
            BufferInfo bufferInfo = ImageLoader.getBGRFromFile(file);
            width = bufferInfo.getWidth();
            height = bufferInfo.getHeight();
            ByteByReference imageData = new ByteByReference();
            int size = width * height * 3;
            Pointer imgPointer = new Memory(size);
            imgPointer.write(0, bufferInfo.buffer, 0, size);
            imageData.setPointer(imgPointer);
            ret = FaceEngine.instance.ASFDetectFaces(pointer, width, height,
                    ASF_COLOR_FORMAT.CP_PAF_BGR24.getCode(), imageData, faceInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("faceInfo: " + ret);
        return "ok";
    }

}
