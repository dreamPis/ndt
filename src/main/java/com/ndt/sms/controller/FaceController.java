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
        return "ok";
    }

}
