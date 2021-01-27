package com.ldg.app.contentcenter;

import com.ldg.app.contentcenter.configuration.feign.UserCenterFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ldg
 */
@MapperScan("com.ldg.app.contentcenter.mapper")
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = UserCenterFeignConfiguration.class)//Fegin的全局配置
public class ContentCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentCenterApplication.class, args);
    }

    @Bean
    @LoadBalanced
    /**RestTemplate整合Ribben**/
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
