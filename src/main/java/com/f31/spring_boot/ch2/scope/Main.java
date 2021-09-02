package com.f31.spring_boot.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author F31
 * @Date 2021/09/02 14:56
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1 与 s2 是否相等 " + singletonService1.equals(singletonService2));
        System.out.println("p1 与 p2 是否相等 " + prototypeService1.equals(prototypeService2));
    }
}
