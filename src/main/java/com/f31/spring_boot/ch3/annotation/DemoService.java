package com.f31.spring_boot.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * @author F31
 * @Date 2021/09/03 14:34
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
