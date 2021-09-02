package com.f31.spring_boot.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author F31
 * @Date 2021/09/02 14:08
 */
@Configuration
@ComponentScan("com.f31.spring_boot.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
