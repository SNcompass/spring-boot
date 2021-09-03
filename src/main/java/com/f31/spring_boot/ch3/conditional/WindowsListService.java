package com.f31.spring_boot.ch3.conditional;

/**
 * @Author F31
 * @Date 2021/09/03 14:16
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
