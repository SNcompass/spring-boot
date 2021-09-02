package com.f31.spring_boot.ch1.aop;

import java.lang.annotation.*;

/**
 * 编写拦截规则的注解
 * @Author F31
 * @Date 2021/09/02 9:56
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    
    String name();
}
