package com.f31.spring_boot.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author F31
 * @Date 2021/09/03 10:05
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我{bean-demoListener}接收到了bean-demoPublisher发布的消息：" + msg);
    }
}
