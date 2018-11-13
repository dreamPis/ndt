package com.ndt.sms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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
    public ModelAndView login(HttpServletRequest request){
        return new ModelAndView("login");
    }

}
