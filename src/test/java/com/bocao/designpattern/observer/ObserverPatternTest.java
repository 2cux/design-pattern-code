package com.bocao.designpattern.observer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {
        OrderService.class,
        SmsObserver.class,
        PointObserver.class
})
public class ObserverPatternTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    @Qualifier("sms")
    private Observer smsObserver;

    @Autowired
    @Qualifier("point")
    private Observer pointObserver;

    @Test
    void testObserverPattern_notifyObservers() {
        assertNotNull(orderService);
        assertNotNull(smsObserver);
        assertNotNull(pointObserver);

        orderService.addObserver(smsObserver);
        orderService.addObserver(pointObserver);

        assertDoesNotThrow(() -> orderService.createOrder("1001"));
    }
}