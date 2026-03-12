package com.bocao.designpattern.prototype.deep;

import com.bocao.designpattern.prototype.deep.Address;
import jdk.jfr.DataAmount;
import lombok.Data;

/**
 * 这是一个深克隆的学生类，用于测试原型模式
 */
@Data
public class Student implements Cloneable {

    private String name;
    private int age;
    private Address address;
    //    学生的构造方法，用于创建学生对象
    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 创建并返回当前对象的一个副本
     *
     * @return 当前对象的一个副本
     * @throws CloneNotSupportedException 如果当前对象的类不支持 Cloneable 接口，则抛出 CloneNotSupportedException 异常
     */
    //    重写clone方法，实现浅克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = (Address) address.clone();
        return student;
    }
}
