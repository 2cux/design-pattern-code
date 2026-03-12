package com.bocao.designpattern.designpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SingletonPatternTest {
    /*
       使用单例模式创建两个对象，看他们是否是同一个对象，如果是同一个对象，那么单例模式就是正确的
     */
    @Test
    void testSingleton() {

        // 创建两个对象
        SingletonPattern singleton1 = SingletonPattern.getInstance();
        SingletonPattern singleton2 = SingletonPattern.getInstance();

        // 判断是否同一个对象
        if (singleton1 == singleton2) {
            System.out.println("单例模式测试成功，两个对象是同一个对象");
        } else {
            System.out.println("单例模式测试失败，两个对象不是同一个对象");
        }
    }
}