package com.ndt.sms.controller;

import com.ndt.sms.common.Constants;
import com.ndt.sms.face.jna.FaceEngine;
import com.sun.jna.NativeLong;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        log.info("this is face test: " + ret);
        return "ok";
    }

}
