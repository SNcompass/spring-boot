package com.f31.spring_boot.ch2.profile;

/**
 * @Author F31
 * @Date 2021/09/03 9:27
 */
public class DemoBean {

    private String content;

    public DemoBean(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
