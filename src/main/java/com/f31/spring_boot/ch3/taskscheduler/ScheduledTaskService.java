package com.f31.spring_boot.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author F31
 * @Date 2021/09/03 11:26
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataformat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次" + dataformat.format(new Date()));
    }

    @Scheduled(cron = "0 58 13 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间执行 " + dataformat.format(new Date()));
    }
}
