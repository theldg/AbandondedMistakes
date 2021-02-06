package com.ldg.app.exception;

/**
 * 认证失败异常
 *
 * @author ldg
 */
public class UnauthorizedException extends Exception {

    public UnauthorizedException(String message) {
        //设置父类的message
        super(message);
    }
}
