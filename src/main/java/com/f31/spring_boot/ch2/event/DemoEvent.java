package com.f31.spring_boot.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author F31
 * @Date 2021/09/03 9:52
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 8727278401936854050L;
    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
