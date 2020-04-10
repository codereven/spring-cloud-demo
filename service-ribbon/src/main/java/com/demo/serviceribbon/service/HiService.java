package com.demo.serviceribbon.service;

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

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/test/hi?name="+name,String.class);
    }
}
