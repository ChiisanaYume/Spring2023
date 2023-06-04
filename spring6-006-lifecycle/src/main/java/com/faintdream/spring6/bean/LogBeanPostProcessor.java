package com.faintdream.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LogBeanPostProcessor implements BeanPostProcessor {
    /**
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean后处理器的before()方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行bean后处理器的after()方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
