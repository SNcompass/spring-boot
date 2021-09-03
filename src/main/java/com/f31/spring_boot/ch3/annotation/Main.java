package com.f31.spring_boot.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author F31
 * @Date 2021/09/03 14:36
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
