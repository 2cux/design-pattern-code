package com.bocao.designpattern.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是被观察者类，负责添加观察者，并在状态改变时通知观察者
 */
@Service
public class OrderService {

    //创建一个列表来保存观察者
    private List<Observer> observers = new ArrayList<>();

    //创建添加观察者的方法
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //创建一个方法来通知观察者
    private void notifyObserver(Order order) {
        for (Observer observer : observers) {
            observer.observe(order);
        }
    }

    //创建一个方法来create订单，并且在订单创建成功后通知观察者
    public Order createOrder(String orderId) {
        Order order = new Order(orderId);
        System.out.println("订单创建成功，订单ID：" + orderId);
        notifyObserver(order);
        return order;
    }
}
