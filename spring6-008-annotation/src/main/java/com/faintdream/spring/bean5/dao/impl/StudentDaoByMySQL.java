package com.faintdream.spring.bean5.dao.impl;

import com.faintdream.spring.bean5.dao.StudentDao;

import java.io.PrintStream;

public class StudentDaoByMySQL implements StudentDao {
    /**
     * @param id
     * @return
     */
    @Override
    public int delete(String id) {
        System.out.println("删除一条学生信息【MySQL】");
        return 0;
    }
}
