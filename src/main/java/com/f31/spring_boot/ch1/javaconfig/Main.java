package com.f31.spring_boot.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author F31
 * @Date 2021/09/01 16:55
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("hello javaConfig"));
        context.close();
    }
}
