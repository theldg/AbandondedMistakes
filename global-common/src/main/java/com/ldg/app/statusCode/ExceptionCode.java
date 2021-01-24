package com.ldg.app.statusCode;

/**
 * @author ldg
 */
public enum ExceptionCode {
    /**
     * 系统异常
     */
    SystemException(1001, "系统异常");
    private Integer code;
    private String msg;

    ExceptionCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
