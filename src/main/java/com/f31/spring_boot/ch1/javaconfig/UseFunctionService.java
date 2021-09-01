package com.f31.spring_boot.ch1.javaconfig;



/**
 * @Author F31
 * @Date 2021/09/01 16:28
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
