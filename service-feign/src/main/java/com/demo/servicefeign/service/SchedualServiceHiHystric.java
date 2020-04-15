package com.demo.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName SchedualServiceHiHysrix
 * @Description TODO
 * @Anchor changzx@cnnho.com
 * @Date 2020/4/15
 * @Version 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    /**
     * 实现类 增加熔断返回信息
     * @param name
     * @return
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
