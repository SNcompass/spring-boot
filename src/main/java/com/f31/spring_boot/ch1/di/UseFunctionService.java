package com.f31.spring_boot.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author F31
 * @Date 2021/09/01 16:28
 */
@Service
public class UseFunctionService {

    @Resource
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
