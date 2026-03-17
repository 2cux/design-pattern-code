package com.bocao.designpattern.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 这是一个装饰器模式的测试类，用于测试装饰器模式
 */
@SpringBootTest
public class decoratorTest {

    @Test
    void basicCoffeeTest() {
        Coffee coffee = new BasicCoffee();

        Assertions.assertEquals("原味咖啡",coffee.getDescription());
        Assertions.assertEquals(10,coffee.getCost());
    }

    @Test
    void milkCoffeeTest() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);

        Assertions.assertEquals("原味咖啡 + 牛奶",coffee.getDescription() );
        Assertions.assertEquals(13, coffee.getCost());
    }

    @Test
    void sugarMilkCoffeeTest() {
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        Assertions.assertEquals("原味咖啡 + 牛奶 + 糖", coffee.getDescription());
        Assertions.assertEquals(14, coffee.getCost());
    }
}
