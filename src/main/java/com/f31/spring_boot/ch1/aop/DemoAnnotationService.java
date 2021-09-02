package com.f31.spring_boot.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @Author F31
 * @Date 2021/09/02 10:01
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
