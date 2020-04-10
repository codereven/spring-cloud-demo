package com.demo.servicehi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ClientTestController
 * @Description TODO
 * @Anchor changzx@cnnho.com
 * @Date 2020/4/10
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class ClientTestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
