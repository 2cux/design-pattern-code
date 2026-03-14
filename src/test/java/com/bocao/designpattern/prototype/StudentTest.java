package com.bocao.designpattern.prototype.shallow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotSame;

@SpringBootTest
class StudentTest {
    /*
    测试原型模式的浅克隆，创建一个学生对象，然后克隆这个学生对象，修改克隆对象的地址，看看原对象的地址是否也被修改了，如果被修改了，那么说明是浅克隆，如果没有被修改，那么说明是深克隆
     */

    @Autowired
    private Student student1;

    @Autowired
    private Student student2;

    @Test
    void testPrototype() {

        assertNotSame(student1,student2);
        System.out.println("测试成功，两个对象的地址不相同，不是同一个对象");
    }
}
/*
  student1和student2是两个不同的对象（对象的地址不一样），但是他们的address是共用同一个地址的
 */