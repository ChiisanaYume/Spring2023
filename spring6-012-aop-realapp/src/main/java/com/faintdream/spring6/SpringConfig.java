package com.faintdream.spring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //代替spring.xml文件
@ComponentScan({"com.faintdream.spring6.service","com.faintdream.spring6.aspectj"}) //配置组件扫描的包
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
