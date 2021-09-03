package com.f31.spring_boot.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author F31
 * @Date 2021/09/03 9:31
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext devContext = new AnnotationConfigApplicationContext();
        devContext.getEnvironment().setActiveProfiles("dev");
        devContext.register(ProfileConfig.class);
        devContext.refresh();

        DemoBean devDemoBean = devContext.getBean(DemoBean.class);
        System.out.println(devDemoBean.getContent());
        devContext.close();

        AnnotationConfigApplicationContext prodContext = new AnnotationConfigApplicationContext();
        prodContext.getEnvironment().setActiveProfiles("prod");
        prodContext.register(ProfileConfig.class);
        prodContext.refresh();

        DemoBean prodDemoBean = prodContext.getBean(DemoBean.class);
        System.out.println(prodDemoBean.getContent());

        prodContext.close();
    }
}
