package com.bocao.designpattern.observer;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * 这是一个订单实体类，用于测试观察者模式
 */
@Data
public class Order {

    private String OrderId;

    //更具Order的ID来创建订单对象
    public Order(String orderId) {
        this.OrderId = orderId;
    }

}
