package com.faintdream.spring.dao;

/**
 * 持久化层(调用数据库)
 *
 * @author faintdream
 * @version 1.0
 */
public interface UserDao {

    /**
     * 根据id删除用户信息
     * @param id
     */
    void deleteById(Integer id);
}
