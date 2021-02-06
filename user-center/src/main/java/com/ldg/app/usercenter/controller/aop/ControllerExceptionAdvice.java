package com.ldg.app.usercenter.controller.aop;

import com.ldg.app.enums.ReslutCode;
import com.ldg.app.exception.UnauthorizedException;
import com.ldg.app.response.ReslutDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ldg
 * 统一的异常处理
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {
    /**
     * 处理认证异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ReslutDto> unauthorizedExceptionHandler(UnauthorizedException e) {
        return new ResponseEntity<>(
                ReslutDto.builder()
                        .msg(e.getMessage())
                        .code(ReslutCode.Unauthorized.getCode())
                        .data(ReslutCode.Unauthorized.getMsg())
                        .build()
                , HttpStatus.UNAUTHORIZED
        );
    }

}
