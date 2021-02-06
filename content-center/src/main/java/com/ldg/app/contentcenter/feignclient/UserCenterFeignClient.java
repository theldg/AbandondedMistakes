package com.ldg.app.contentcenter.feignclient;

import com.ldg.app.contentcenter.configuration.feign.UserCenterFeignConfiguration;
import com.ldg.app.response.ReslutDto;
import jdk.nashorn.internal.parser.Token;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author ldg
 */
@FeignClient(name = "user-center", configuration = UserCenterFeignConfiguration.class)
public interface UserCenterFeignClient {

    @GetMapping("users/{id}")
    /**
     * 调用该方法时会访问http://user-center/users/{id}
     * token:在请求的header中构造X-Token
     */
    ReslutDto findById(@PathVariable Integer id, @RequestHeader("X-Token") String token);

}
