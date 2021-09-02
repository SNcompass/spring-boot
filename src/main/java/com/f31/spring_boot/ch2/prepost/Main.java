package com.f31.spring_boot.ch2.prepost;

import com.sun.org.apache.bcel.internal.generic.JSR;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author F31
 * @Date 2021/09/02 16:57
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
