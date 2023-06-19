package com.faintdream.spring.bean5.dao.impl;

import com.faintdream.spring.bean5.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoByOracle implements StudentDao {

    /**
     * @param id
     * @return
     */
    @Override
    public int delete(String id) {
        System.out.println("删除一条学生信息【Oracle】");
        return 0;
    }
}
