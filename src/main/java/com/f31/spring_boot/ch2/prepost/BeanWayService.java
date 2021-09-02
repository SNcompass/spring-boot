package com.f31.spring_boot.ch2.prepost;

/**
 * @Author F31
 * @Date 2021/09/02 16:42
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
