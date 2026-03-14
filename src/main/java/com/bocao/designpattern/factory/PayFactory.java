package com.bocao.designpattern.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 这是一个支付工厂类，用于测试工厂模式
 * 将创建的Bean对象注入Map中，这样使用中可以快速通过key来找到对应的方法
 */
@Component
public class PayFactory {

    @Autowired
    private Map<String, PayService> payServiceMap;

    public PayService getPayService(String payType) {

        return payServiceMap.get(payType);
    }
}
