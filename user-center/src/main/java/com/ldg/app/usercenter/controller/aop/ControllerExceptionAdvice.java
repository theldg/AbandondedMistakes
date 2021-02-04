package com.ldg.app.usercenter.controller.aop;

import com.ldg.app.enums.ExceptionCode;
import com.ldg.app.response.ReslutDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ldg
 * 统一的异常处理
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ReslutDto exceptionHandler(Exception e) {
        return ReslutDto.builder().msg(ExceptionCode.SystemException.getMsg()).code(ExceptionCode.SystemException.getCode()).data(e.getMessage()).build();
    }

}
