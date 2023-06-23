package com.faintdream.spring6.jdbc;

import com.faintdream.spring6.jdbc.pojo.RolePhysique;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTest1 {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void SelectTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate1",JdbcTemplate.class);

        // select语句
        String sql = "SELECT no,physique,physique_c FROM t_role_physique WHERE no=? ";

        RolePhysique physique = template.queryForObject(sql,new BeanPropertyRowMapper<>(RolePhysique.class),6);

        System.out.println(physique);
    }

}
