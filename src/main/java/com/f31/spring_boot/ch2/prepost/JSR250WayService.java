package com.f31.spring_boot.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author F31
 * @Date 2021/09/02 16:45
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destroy-method");
    }
}
