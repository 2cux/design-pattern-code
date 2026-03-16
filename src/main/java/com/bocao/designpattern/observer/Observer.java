package com.bocao.designpattern.observer;

import org.springframework.stereotype.Component;

/**
 * 这是一个观察这接口，用来创建具体的事件观察者
 * 更具订单的Id来观察订单
 */
@Component
public interface Observer {

    //传入order，包含更多的信息
    void observe(Order order);

}
