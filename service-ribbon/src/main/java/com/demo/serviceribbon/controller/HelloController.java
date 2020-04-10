package com.demo.serviceribbon.controller;

import com.demo.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HeoolController
 * @Description TODO
 * @Anchor changzx@cnnho.com
 * @Date 2020/4/10
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    HiService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
