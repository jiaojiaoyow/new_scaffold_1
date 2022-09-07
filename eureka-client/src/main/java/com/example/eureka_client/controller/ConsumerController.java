package com.example.eureka_client.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 测试接口
 * @author chenzejian
 * @date 2022/09/06 20:44
 **/
@RestController
@RequestMapping(value = "consumer")
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;
//
//    @GetMapping("{id}")
//    public User queryById(@PathVariable(value = "id") Long id) {
//        // 根据服务 ID 获取实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        // 从实例中取出 IP 和端口
//        ServiceInstance serviceInstance = instances.get(0);
//        String hostAndPort = serviceInstance.getHost() + ":" + serviceInstance.getPort();
//        String url = "http://" + hostAndPort + "/user/" + id;
//        User user = restTemplate.getForObject(url, User.class);
//        return user;
//    }
}
