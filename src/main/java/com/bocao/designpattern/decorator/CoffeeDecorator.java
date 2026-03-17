package com.bocao.designpattern.decorator;

/**
 * 这是一个咖啡装饰器的抽象类，之所以写抽象类而不是接口，是因为接口不能有变量和构造方法，所以子类就必须重新写
 */
public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

}
