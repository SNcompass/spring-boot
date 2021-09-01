package com.f31.spring_boot.ch1.di;

import org.springframework.stereotype.Service;

/**
 * @Author F31
 * @Date 2021/09/01 16:21
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
