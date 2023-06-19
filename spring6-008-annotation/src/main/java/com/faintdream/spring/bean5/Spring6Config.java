package com.faintdream.spring.bean5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 编写一个类，代替Spring框架的配置文件
 * @author faintdream
 * @version 1.0
 * @className Spring5Config
 * */
@Configuration
@ComponentScan({"com.faintdream.spring.bean5.dao","com.faintdream.spring.bean5.service"})
public class Spring6Config {
}
