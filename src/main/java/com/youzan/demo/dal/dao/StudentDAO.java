package com.youzan.demo.dal.dao;

import com.youzan.demo.dal.entity.Student;

/**
 * Created by zhouxuan on 2018/2/5.
 */
public interface StudentDAO {

    //插入
    int insert(Student student);
    //查找
    Student select(int id);
    //更新
    int update(Student student);
    //删除
    int delete(int id);
    //查询分数
    int selectScore(int id);

}
