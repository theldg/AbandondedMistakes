package com.ldg.app.contentcenter.configuration.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author ldg
 * 注意不要添加@Configuration注解 否则会引文父子上下文问题而导致所有的FeginClient共享该配置
 */
public class UserCenterFeignConfiguration {
    /**
     * 配置feign打印的日志级别
     *
     * @return
     */
    @Bean
    public Logger.Level level() {
        return Logger.Level.BASIC;
    }

}
