package com.faintdream.spring.bean5.service;

import com.faintdream.spring.bean5.dao.StudentDao;

public class StudentService {
    private StudentDao dao;

    public void deleteStudent(){
        dao.delete("2586");
    }

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }
}
