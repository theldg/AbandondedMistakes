package com.ldg.app.contentcenter.feignclient;

import com.ldg.app.contentcenter.configuration.feign.UserCenterFeignConfiguration;
import com.ldg.app.response.ReslutDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ldg
 */
@FeignClient(name = "user-center")
public interface UserCenterFeignClient {

   @GetMapping("users/{id}")
   /**
    * 调用该方法时会访问http://user-center/users/{id}
    */
   ReslutDto findById(@PathVariable Integer id);

}
