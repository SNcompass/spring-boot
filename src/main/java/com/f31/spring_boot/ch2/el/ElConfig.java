package com.f31.spring_boot.ch2.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;

/**
 * @Author F31
 * @Date 2021/09/02 15:11
 */
@Configuration
@ComponentScan("com.f31.spring_boot.ch2.el")
@PropertySource("classpath:com/f31/spring_boot/ch2/el/test.properties")
public class ElConfig {

    @Value("I Love You")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoService.anthoer}")
    private String fromAnother;

    @Value("classpath:com/f31/spring_boot/ch2/el/test.txt")
    private Resource testfile;

    @Value("https://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testfile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
