package com.bocao.designpattern.designpattern;

/**
 * 这是单例模式的具体实践
 */
public class SingletonPattern {
    //    创建一个私有的类（注意不是对象），用于存储单例对象
    private static SingletonPattern instance;
    //    构造私有化创建函数，使对象只能在这里创建
    private SingletonPattern() {

    }
    //    创建一个公共的方法，用于获取单例对象
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}