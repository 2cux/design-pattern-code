package com.bocao.designpattern.abstractfactory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
public class AbstractFactoryTest {

    // 注入一个Map，key是String类型，value是DaoFactory类型，这个Map中包含了所有的DaoFactory实例
    @Autowired
    private Map<String,DaoFactory> daoFactoryMap;

    @Test
    void testAbstarctFactory() {

        // 从Map中获取DaoFactory实例，这样子就实现了解耦，将来只用在这里添加代码即可
        DaoFactory mysqlFactory = daoFactoryMap.get("mysql");
        DaoFactory oracleFactory = daoFactoryMap.get("oracle");

        //测试保存用户的方法
        assertDoesNotThrow(() -> {
            mysqlFactory.createUserDao().saveUser();
            oracleFactory.createUserDao().saveUser();
        });

        //测试保存订单的方法
        assertDoesNotThrow(() -> {
            mysqlFactory.createOrderDao().saveOrder();
            oracleFactory.createOrderDao().saveOrder();
        });
    }
}
