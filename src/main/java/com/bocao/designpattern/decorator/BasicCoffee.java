package com.bocao.designpattern.decorator;

import org.springframework.stereotype.Component;

/**
 * 这是一个基本的咖啡类，将来在这上面添加装饰器来增加功能
 */
public class BasicCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "原味咖啡";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
