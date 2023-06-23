package com.faintdream.spring6.jdbc;

import com.faintdream.spring6.jdbc.pojo.RolePhysique;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JdbcTest {

    private final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

    @Ignore
    @Test
    public void InsertTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // insert语句
        String sql = "insert into t_role_physique(no,physique,physique_c) value(?,?,?);";

        // 注意 在jdbcTemplate当中,只要是insert delete update语句,都是调用update方法
        int count = template.update(sql,"7","Old man","老男人");

        System.out.println(count);

    }

    @Ignore
    @Test
    public void updateTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // update语句
        String sql = "update t_role_physique SET physique_c=? WHERE no=?";

        // 注意 在jdbcTemplate当中,只要是insert delete update语句,都是调用update方法
        int count = template.update(sql,"老头",7);

        System.out.println(count);

    }
    @Ignore
    @Test
    public void deleteTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // delete语句
        String sql = "delete from t_role_physique where no=?";

        // 注意 在jdbcTemplate当中,只要是insert delete update语句,都是调用update方法
        int count = template.update(sql,"7");

        System.out.println(count);
    }

    @Test
    public void queryOneTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);

        // select语句
        String sql = "SELECT no,physique,physique_c FROM t_role_physique WHERE no=? ";

        RolePhysique physique = template.queryForObject(sql,new BeanPropertyRowMapper<>(RolePhysique.class),6);

        System.out.println(physique);

    }

    @Test
    public void queryAllTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);

        // select语句
        String sql = "SELECT no,physique,physique_c FROM t_role_physique";

        List<RolePhysique> physiques = template.query(sql, new BeanPropertyRowMapper<>(RolePhysique.class));

        System.out.println(physiques);
    }

    @Test
    public void queryOneValue(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);

        // select语句
        String sql = "SELECT count(1) FROM t_role_physique";// 返回总记录条数

        Integer total = template.queryForObject(sql, int.class);

        System.out.println("总记录条数:" + total);

    }

    @Ignore
    @Test
    public void addBatchTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // 批量添加
        String sql = "INSERT into t_role_physique(no,physique,physique_c) values(?,?,?)";

        Object[] obj1 = {7,"Old man","老头"};
        Object[] obj2 = {8,"Old woman","老太太"};
        Object[] obj3 = {9,"Waixingren","外星人"};

        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        int[] count = template.batchUpdate(sql, list);

        System.out.println(count);
    }

    @Ignore
    @Test
    public void updateBathTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // 批量更新
        String sql = "UPDATE t_role_physique set physique=?,physique_c=? WHERE no=?";

        Object[] obj1 = {"Old man","老Boy","7"};
        Object[] obj2 = {"Old woman","老Baby","8"};

        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        int[] count = template.batchUpdate(sql, list);
        System.out.println(count);
    }

    @Ignore
    @Test
    public void deleteBatchTest(){
        JdbcTemplate template = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // 批量添加
        String sql = "DELETE FROM t_role_physique WHERE no=?";

        Object[] obj1 = {7};
        Object[] obj2 = {8};
        Object[] obj3 = {9};

        List<Object[]> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        int[] count = template.batchUpdate(sql, list);

        System.out.println(count);
    }

    @Test
    public void callbackTest(){
        // 如果要写jdbc代码，可以使用callback回调函数
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        // SQL语句
        String sql = "SELECT no,physique,physique_c FROM t_role_physique WHERE no=?";

        // 执行查询(并注册回调函数)
        Object o = jdbcTemplate.execute(sql, new PreparedStatementCallback<Object>() {

            @Override
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                RolePhysique rolePhysique = null;
                ps.setString(1, "6");
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    rolePhysique = new RolePhysique(rs.getString("no"), rs.getString("physique"),
                            rs.getString("physique_c"));
                }
                return rolePhysique;
            }
        });

        System.out.println(o);

    }
}
