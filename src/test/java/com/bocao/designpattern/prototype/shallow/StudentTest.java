package com.bocao.designpattern.prototype.shallow;

import org.junit.jupiter.api.Test;

class StudentTest {
    /*
    测试原型模式的浅克隆，创建一个学生对象，然后克隆这个学生对象，修改克隆对象的地址，看看原对象的地址是否也被修改了，如果被修改了，那么说明是浅克隆，如果没有被修改，那么说明是深克隆
     */
    @Test
    void testShallowClone() throws CloneNotSupportedException {
        Address shallowAddress = new Address("辽宁");
        Student shallowStudent1 = new Student("铁明", 18, shallowAddress);
        Student shallowStudent2 = (Student) shallowStudent1.clone();
        if(shallowStudent1 == shallowStudent2) {
            System.out.println("克隆失败，两个对象是同一个对象");
        } else {
            System.out.println("克隆成功，两个对象不是同一个对象");
        }
    }
}
/*
  student1和student2是两个不同的对象（对象的地址不一样），但是他们的address是共用同一个地址的
 */