package com.demo.servicefeign.api;

import com.demo.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FeifnController
 * @Description TODO
 * @Anchor changzx@cnnho.com
 * @Date 2020/4/14
 * @Version 1.0
 */
@RestController
public class FeifnController {

    @Resource
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
