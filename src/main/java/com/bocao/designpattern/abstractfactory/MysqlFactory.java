package com.bocao.designpattern.abstractfactory;

import org.springframework.stereotype.Component;

/**
 * 这是一个MySQL工厂类，实现了DaoFactory接口，负责创建MySQL版本的UserDao和OrderDao对象
 */
@Component("mysql")
public class MysqlFactory implements DaoFactory{

    @Override
    public UserDao createUserDao() {
        return new MysqlUserDao();
    }

    @Override
    public OrderDao createOrderDao() {
        return new MysqlOrderDao();
    }
}
