package com.bocao.designpattern.decorator;

/**
 * 这是一个牛奶装饰器类，用于测试装饰器模式
 */
public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + 牛奶";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 3.0;
    }
}
