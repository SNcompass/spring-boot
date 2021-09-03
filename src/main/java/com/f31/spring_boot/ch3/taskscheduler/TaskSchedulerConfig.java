package com.f31.spring_boot.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author F31
 * @Date 2021/09/03 11:29
 */
@Configuration
@ComponentScan("com.f31.spring_boot.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
