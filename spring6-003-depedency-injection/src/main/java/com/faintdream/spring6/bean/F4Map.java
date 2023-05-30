package com.faintdream.spring6.bean;

import java.util.HashMap;
import java.util.Map;

public class F4Map {

    private Map f;

    private Map<String,Student> studentMap;

    public Map getF() {
        return f;
    }

    public void setF(Map f) {
        this.f = f;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }
}
