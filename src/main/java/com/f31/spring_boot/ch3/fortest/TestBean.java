package com.f31.spring_boot.ch3.fortest;

/**
 * @author F31
 * @Date 2021/09/03 16:13
 */
public class TestBean {

    private String content;

    public TestBean(String content){
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
