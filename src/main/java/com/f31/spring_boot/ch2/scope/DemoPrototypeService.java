package com.f31.spring_boot.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author F31
 * @Date 2021/09/02 14:54
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
