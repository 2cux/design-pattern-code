package com.bocao.designpattern.prototype.deep;

import org.junit.jupiter.api.Test;

class StudentTest {
    /*
    测试原型模式的浅克隆，创建一个学生对象，然后克隆这个学生对象，修改克隆对象的地址，看看原对象的地址是否也被修改了，如果被修改了，那么说明是浅克隆，如果没有被修改，那么说明是深克隆
     */
    @Test
    void testShallowClone() throws CloneNotSupportedException {
        Address deepAddress = new Address("辽宁");
        Student deeepStudent1 = new Student("铁明", 18, deepAddress);
        Student deepStudent2 = (Student) deeepStudent1.clone();
//        这一步相当于是给克隆体重新设置地址
        deepStudent2.getAddress().city = "吉林";
        if(deeepStudent1.getAddress() == deepStudent2.getAddress()) {
            System.out.println("深克隆失败，两个对象更共用同一个地址");
        } else {
            System.out.println("克隆成功，两个对象的地址不是同一个");
        }
    }
}
/*
  student1和student2是两个不同的对象，address的地址也不一样，所以是深克隆
 */