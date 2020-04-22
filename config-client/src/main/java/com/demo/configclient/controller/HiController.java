package com.demo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Description TODO
 * @Anchor changzx@cnnho.com
 * @Date 2020/4/22
 * @Version 1.0
 */
@RestController
public class HiController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

}
