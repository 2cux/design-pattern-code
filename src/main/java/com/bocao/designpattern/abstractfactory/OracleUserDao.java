package com.bocao.designpattern.abstractfactory;

/**
 * 这是一个Oracle用户数据访问对象的实现类，用于测试抽象工厂模式
 * 不用加@Service注解，因为我们不使用Spring框架来管理这个类的生命周期，而是通过工厂模式来创建这个类的实例
 */

public class OracleUserDao implements UserDao{

    @Override
    public void saveUser() {
        System.out.println("使用Oracle保存用户");
    }
}
