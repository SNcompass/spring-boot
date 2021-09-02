package com.f31.spring_boot.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author F31
 * @Date 2021/09/02 15:09
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String anthoer;

    public String getAnthoer() {
        return anthoer;
    }

    public void setAnthoer(String anthoer) {
        this.anthoer = anthoer;
    }
}
