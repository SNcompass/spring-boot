package com.f31.spring_boot.ch3.conditional;

/**
 * @Author F31
 * @Date 2021/09/03 14:17
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
