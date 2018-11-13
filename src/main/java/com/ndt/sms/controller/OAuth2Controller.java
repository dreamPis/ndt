package com.ndt.sms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author ser7en
 * @Date 2018-11-09 09:56
 * @version：
 * @Desc：
 */
@RestController
@Slf4j
public class OAuth2Controller {

    @GetMapping("/user/{username}")
    public String login(@PathVariable String username, HttpServletRequest request){
        return "login";
    }

}
