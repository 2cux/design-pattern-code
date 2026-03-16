package com.bocao.designpattern.abstractfactory;

import org.springframework.stereotype.Component;

/**
 * 这是一个抽象工厂接口，定义了创建用户数据访问对象和订单数据访问对象的方法
 * 返回接口的原因是为了解耦，降低代码的依赖关系，使得代码更加灵活和可维护
 */
@Component
public interface DaoFactory {

    UserDao createUserDao();

    OrderDao createOrderDao();
}
