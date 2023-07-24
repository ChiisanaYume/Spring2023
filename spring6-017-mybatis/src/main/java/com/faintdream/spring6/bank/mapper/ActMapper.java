package com.faintdream.spring6.bank.mapper;

import com.faintdream.spring6.bank.pojo.Act;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Mapper 接口，连接数据库
 * @author faintdream
 * @version 1.0
 * */
@MapperScan
public interface ActMapper {

    /**
     * 查询一条数据
     * */
    Act selectByActNo(String actNo);

    /**
     * 查询所有数据
     * */
    List<Act> selectAll();

    /**
     * 修改一条数据
     * */
    int update(Act act);

}
