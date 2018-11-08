package com.ndt.sms.common;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author ser7en
 * @Date 2018-10-09 15:03
 * @version：
 * @Desc：
 */
@Slf4j
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public String processException(RuntimeException exception){
        log.info("自定义异常处理-RuntimeException");
        return exception.getMessage();
    }

    @ExceptionHandler({ Exception.class })
    @ResponseStatus(HttpStatus.OK)
    public String processException(Exception exception) {
        log.info("自定义异常处理-Exception");
        return exception.getMessage();
    }

}
