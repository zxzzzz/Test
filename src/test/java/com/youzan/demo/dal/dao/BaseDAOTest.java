package com.youzan.demo.dal.dao;

import com.youzan.demo.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhouxuan on 2018/2/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.NONE,
        properties = {"logging.level.org.mybatis=debug", "logging.level.com.youzan=debug"})
@AutoConfigureTestDatabase
@ActiveProfiles({"default", "dev"})
@Transactional


public abstract class BaseDAOTest {
}
