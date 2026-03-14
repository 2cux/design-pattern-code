package com.bocao.designpattern.prototype.shallow;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 这是一个浅克隆的学生类，用于测试原型模式
 */
@Data
@Component
@Scope("prototype")
public class Student{

    private String name;
    private int age;
    private Address address;
}
