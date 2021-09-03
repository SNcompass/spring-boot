package com.f31.spring_boot.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author F31
 * @Date 2021/09/03 13:55
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);
    }
}
