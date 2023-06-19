package com.faintdream.spring.bean5.service;

import com.faintdream.spring.bean5.dao.StudentDao;
import com.faintdream.spring.bean5.dao.impl.StudentDaoByOracle;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Retention;

@Service
public class StudentService {


    private StudentDao dao;

    public void deleteStudent(){
        dao.delete("2586");
    }

    public StudentDao getDao() {
        return dao;
    }

    @Resource(name="studentDaoByOracle")
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
}
