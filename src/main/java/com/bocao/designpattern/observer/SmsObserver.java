package com.bocao.designpattern.observer;

import org.springframework.stereotype.Component;

/**
 * 短信观察者类，用于监听订单变化，发送短信通知
 */
@Component("sms")
public class SmsObserver implements Observer{

    @Override
    public void observe(Order order) {
        System.out.println("发送短信通知，订单Id：" + order);
    }
}
