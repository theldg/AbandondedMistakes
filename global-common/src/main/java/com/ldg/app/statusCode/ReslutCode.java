package com.ldg.app.statusCode;

/**
 * @author ldg
 */
public enum ReslutCode {
    /**
     * 请求响应成功
     */
    Ok(200, "成功响应"),
    /**
     * 请求没有被认证
     */
    Unauthorized(401, "没有认证"),
    /**
     * 请求被禁止
     */
    Forbidden(403, "禁止访问"),
    /**
     * 请求资源不存在
     */
    NotFound(404, "资源不存在");
    private Integer code;
    private String msg;

    ReslutCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
