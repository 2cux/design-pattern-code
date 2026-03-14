package com.bocao.designpattern.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SingletonTest {
    /*
       使用单例模式创建两个对象，看他们是否是同一个对象，如果是同一个对象，那么单例模式就是正确的
     */
    @Autowired
    private Singleton singleton1;

    @Autowired
    private Singleton singleton2;

    @Test
    void testSingleton() {

        // 判断是否同一个对象
       assertSame(singleton1,singleton2);

        System.out.println("测试成功，两个对象的地址相同，是同一个对象");
    }
}