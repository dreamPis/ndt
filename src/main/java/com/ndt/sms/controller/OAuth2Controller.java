package com.ndt.sms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author ser7en
 * @Date 2018-11-09 09:56
 * @version：
 * @Desc：
 */
@Controller
@Slf4j
public class OAuth2Controller {

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

}
