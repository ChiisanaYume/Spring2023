package com.faintdream.spring.bean;

import org.springframework.stereotype.Controller;

/**
 * java bean
 * @className User2
 * @author faintdream
 * @version 1.0
 *
 * */
@Controller()//value可以省略,bean的名字为类名首字母变小写
// 这个注解相当于这个配置信息 <bean id="user2" class="com.faintdream.spring.User2"/>
public class User2 {
    public User2() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
