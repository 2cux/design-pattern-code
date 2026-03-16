package com.bocao.designpattern.abstractfactory;


import org.springframework.stereotype.Component;

/**
 * 这是一个Oracle工厂类，实现了DaoFactory接口，负责创建Oracle版本的UserDao和OrderDao对象
 */
@Component("oracle")
public class OracleFactory implements DaoFactory{

    @Override
    public UserDao createUserDao() {
        return new OracleUserDao();
    }

    @Override
    public OrderDao createOrderDao() {
        return new OracleOrderDao();
    }
}
