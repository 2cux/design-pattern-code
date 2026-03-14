package com.bocao.designpattern.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //注入工厂类，用于创建支付服务对象
    @Autowired
    private PayFactory payFactory;

    //写具体的顶顶那处理方法
    public void createOrder(String paytype) {

        PayService payService = payFactory.getPayService(paytype);
        payService.pay();
    }
}
