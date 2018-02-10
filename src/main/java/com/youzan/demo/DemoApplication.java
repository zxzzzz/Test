package com.youzan.demo;

import com.youzan.boot.autoconfigure.nova.EnableNova;
import com.youzan.demo.dal.dao.StudentDAO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by zhouxuan on 2018/2/5.
 */

@SpringBootApplication
@EnableNova
@MapperScan("com.youzan.demo.dal.dao")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Resource
    private DataSource dataSource;


    @Resource
    private StudentDAO studentDAO;


    @Bean
    public CommandLineRunner runner() {

        return args -> {
            System.out.println(dataSource);
            System.out.println("有你有赞");
            System.out.println(studentDAO.select(1));
            System.out.println("有你有赞");
        };
    }
}
