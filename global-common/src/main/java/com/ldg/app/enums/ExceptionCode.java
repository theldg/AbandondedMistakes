package com.ldg.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ldg
 */
@Getter
@AllArgsConstructor
public enum ExceptionCode {

    SystemException(1001, "系统异常"),
    FlowException(1002, "限流异常"),
    DegradeException(1003, "降级异常"),
    ParamFlowException(1004, "热点参数限流"),
    SystemBlockException(1005, "系统规则(负载/...不满足要求)"),
    AuthorityException(1006, "授权规则不通过");
    private final Integer code;
    private final String msg;


}
