package com.bocao.designpattern.decorator;

/**
 * 定义一个咖啡接口，是为了接口统一，让装饰器和被装饰的对象都实现同一个接口，这样就可以在不修改原有代码的情况下，动态地给对象添加新的功能
 */
public interface Coffee {
    // 获取咖啡的描述
    String getDescription();

    // 获取咖啡的价格
    double getCost();
}
