package com.faintdream.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂方法 - 具体产品工厂
 * FactoryBean也是一个Bean,只不过这个bean比较特殊，是一个工厂bean
 * 通过工厂bean可以获取一个简单bean
 * @version 1.0
 * @author faintdream
 * */

public class PersonFactory implements FactoryBean<Person> {
    /**
     * @return Person
     */
    @Override
    public Person getObject() {
        return new Person();
    }

    /**
     * @return Person.class
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    /**
     * 这个方法是有默认实现的，默认返回true
     * 表示单例
     * 如果想要多例，返回false
     * @return true
     */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
