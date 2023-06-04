package com.faintdream.spring6.bean;

import org.springframework.beans.factory.DisposableBean;

public class Student implements DisposableBean {

    public Student() {
    }


    /**
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy()方法执行了...");
    }
}
