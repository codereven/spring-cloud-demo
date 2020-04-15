package com.demo.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HiService
 * @Description TODO
 * @Anchor changzx@cnnho.com
 * @Date 2020/4/10
 * @Version 1.0
 */
@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

    //增加熔断监听
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/test/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
