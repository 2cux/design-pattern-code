package com.bocao.designpattern.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 这是一个订单服务的测试类，用于测试工厂模式
 */
@SpringBootTest
class OrderServiceTest {

    //不要直接new对象，通过依赖注入来创建对象
    @Autowired
    private OrderService orderService;

    @Test
    void testOrderService() {

        assertDoesNotThrow(() -> {
            orderService.createOrder("wechatPay");});
    }
}