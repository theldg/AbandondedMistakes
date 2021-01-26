package com.ldg.app.contentcenter.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ldg
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("test")
public class TestController {


    private final DiscoveryClient discoveryClient;

    @GetMapping("nacos")
    public List<ServiceInstance> getInstance() {

        return discoveryClient.getInstances("user-center");
    }

    @GetMapping("nacos2")
    public List<String> getService() {

        return discoveryClient.getServices();
    }
}
