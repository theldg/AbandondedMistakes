package com.ldg.app.contentcenter.annotation;

import com.ldg.app.contentcenter.jjwt.JwtOperator;
import com.ldg.app.exception.UnauthorizedException;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ldg
 */
@Aspect
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CheckLoginAspect {
    /**
     * jwt服务
     */
    private final JwtOperator jwtOperator;

    /**
     * 只切入controller包下的类
     * *    com.ldg.app.usercenter.controller.*.      *       (..)
     * 返回值     类(cotrller当前包下的类:不包括子包)     方法名   方法参数
     *
     * @param point
     * @return
     * @throws UnauthorizedException
     */
    @Around("@annotation(com.ldg.app.contentcenter.annotation.CheckLogin)")
    public Object checkLogin(ProceedingJoinPoint point) throws UnauthorizedException {
        try {
            //1.从header里面获取token
            //静态获取request
            //2.校验token是否合法,如果不合法,直接抛异常
            RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
            HttpServletRequest request = servletRequestAttributes.getRequest();
            String token = request.getHeader("X-Token");
            jwtOperator.validateToken(token);
            return point.proceed();
        } catch (Throwable e) {
            throw new UnauthorizedException("Token校验失败");
        }

    }
}
