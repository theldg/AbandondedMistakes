package com.ldg.app.contentcenter.controller.aop;


import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.ldg.app.enums.ExceptionCode;
import com.ldg.app.response.ReslutDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ldg
 * 统一的异常处理
 * 处理范围是整个sevlet周期
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionAdvice {

    /**
     * 热点参数异常处理器
     */
    @ExceptionHandler(ParamFlowException.class)
    public ReslutDto paramFlowExceptionHandler(ParamFlowException e) {
        return ReslutDto.builder().msg(ExceptionCode.ParamFlowException.getMsg()).code(ExceptionCode.ParamFlowException.getCode()).data(e.getRuleLimitApp()).build();
    }

    /**
     * 系统规则异常处理器
     */
    @ExceptionHandler(SystemBlockException.class)
    public ReslutDto systemBlockExceptionHandler(SystemBlockException e) {
        return ReslutDto.builder().msg(ExceptionCode.SystemBlockException.getMsg()).code(ExceptionCode.SystemBlockException.getCode()).data(e.getRuleLimitApp()).build();
    }

    /**
     * 降级异常处理器
     */
    @ExceptionHandler(DegradeException.class)
    public ReslutDto degradeExceptionHandler(DegradeException e) {
        return ReslutDto.builder().msg(ExceptionCode.DegradeException.getMsg()).code(ExceptionCode.DegradeException.getCode()).data(e.getRuleLimitApp()).build();
    }

    /**
     * 授权异常处理器
     */
    @ExceptionHandler(AuthorityException.class)
    public ReslutDto authorityExceptionHandler(AuthorityException e) {
        return ReslutDto.builder().msg(ExceptionCode.AuthorityException.getMsg()).code(ExceptionCode.AuthorityException.getCode()).data(e.getRuleLimitApp()).build();
    }

    /**
     * 流控异常处理器
     */
    @ExceptionHandler(FlowException.class)
    public ReslutDto flowExceptionHandler(FlowException e) {
        return ReslutDto.builder().msg(ExceptionCode.FlowException.getMsg()).code(ExceptionCode.FlowException.getCode()).data(e.getRuleLimitApp()).build();
    }

    /**
     * 默认异常处理器
     */
    @ExceptionHandler(Exception.class)
    public ReslutDto exceptionHandler(Exception e) {
        return ReslutDto.builder().msg(ExceptionCode.SystemException.getMsg()).code(ExceptionCode.SystemException.getCode()).data(e.getMessage()).build();
    }

}
