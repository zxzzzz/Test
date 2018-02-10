package com.youzan.demo.dal.dao;

import com.youzan.demo.dal.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import javax.annotation.Resource;


/**
 * Created by zhouxuan on 2018/2/5.
 */
public class StudentDAOTest extends BaseDAOTest {

    @Resource
    private StudentDAO studentDAO;


    @Test
    public void testInsert() throws Exception {
        Student student = new Student();
        student.setId(1);
        student.setUsername("小红");
        student.setSex(1);
        student.setScore(90);
        int assertNumber = studentDAO.insert(student);
        Assert.assertEquals(1, assertNumber);


    }

    @Test
    @Sql(scripts = "/data-1.sql")
    public void testSelect() throws Exception {
        Assert.assertNotNull(studentDAO.select(1));
    }

    @Sql(scripts = "/data-1.sql")
    @Test
    public void testUpdate() throws Exception {
        Student student = new Student();
        student.setId(1);
        student.setUsername("小红");
        student.setSex(2);
        student.setScore(79);
        Assert.assertEquals(1, studentDAO.update(student));

    }

    @Test
    @Sql(scripts = "/data-1.sql", config =
            @SqlConfig(dataSource = "dataSource", transactionManager = "transactionManager")
    )
    public void testDelete() throws Exception {
        int affectRows = studentDAO.delete(1);

        Assert.assertEquals(1, affectRows);
    }
}