package com.f31.spring_boot.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author F31
 * @Date 2021/09/03 10:32
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        loader=resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为"+beanName);
        Resource resource = loader.getResource("classpath:com/f31/spring_boot/ch3/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为:"+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
