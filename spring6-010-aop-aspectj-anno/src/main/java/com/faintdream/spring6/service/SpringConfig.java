package com.faintdream.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //代替spring.xml文件
@ComponentScan("com.faintdream.spring6.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
