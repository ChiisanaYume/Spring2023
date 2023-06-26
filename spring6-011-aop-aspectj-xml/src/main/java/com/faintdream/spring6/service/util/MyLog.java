package com.faintdream.spring6.service.util;

/**
 * @author faintdream
 * @version 1.0
 * @className MyLog
 * */
public class MyLog {
    private MyLog(){}

    /**
     * @param log 输出内容
     * */
    public static void log(final Object log){
        System.out.println(log);
    }

    /**
     * @param log 输出内容
     * @param caller 调用者
     * */
    public static void log(final Object log,final Object caller){
        String s = String.format("%s【%s】", log, caller.getClass().getSimpleName());
        log(s);
    }
}
