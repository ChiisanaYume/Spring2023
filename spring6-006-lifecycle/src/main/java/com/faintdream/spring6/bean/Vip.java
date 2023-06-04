package com.faintdream.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Vip implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {


    private String name;

    public Vip() {
        System.out.println("实例化(调用Bean无参数构造方法)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("属性赋值(调用Bean的 set()方法)");
    }

    public void init() {
        System.out.println("初始化Bean(调用Bean的 init()方法)");
    }

    public void destroyByBean() {
        System.out.println("销毁Bean(调用Bean的 destroy()方法)");
    }


    /**
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean的名字是什么" + name);
    }

    /**
     * @param classLoader
     */
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean的类加载器是什么" + classLoader);
    }

    /**
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("构建这个Bean的工厂方法是什么" + beanFactory);
    }


    /**
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet() 执行");
    }

    /**
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean 的 destroy()执行");
    }
}
