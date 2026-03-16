package com.bocao.designpattern.observer;

import org.springframework.stereotype.Component;

/**
 * 这是一个积分观察者类，用于监听订单变化，为账户添加积分
 */
@Component("point")
public class PointObserver implements Observer{

    @Override
    public void observe(Order order) {
        System.out.println("为账户添加积分，订单Id：" + order);
    }

}
