package com.ldg.app.contentcenter.controller.aop;

import com.ldg.app.response.ReslutDto;
import com.ldg.app.statusCode.ReslutCode;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author ldg
 * 统一的响应处理
 */
@RestControllerAdvice(basePackages = {"com.ldg.app.usercenter.controller"})
public class ControllerResponseAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        //response是ReslutDto类型或者注释了@NotControllerRes
        return !methodParameter.getParameterType().isAssignableFrom(ReslutDto.class);
    }

    @Override
    public Object beforeBodyWrite(Object data, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        return ReslutDto.builder().data(data).code(ReslutCode.Ok.getCode()).msg(ReslutCode.Ok.getMsg()).build();

    }
}
