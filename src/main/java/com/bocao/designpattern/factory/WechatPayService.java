package com.bocao.designpattern.factory;

import org.springframework.stereotype.Service;

//给Bean对象起一个名字，这样在使用的时候就可以通过这个名字来获取这个Bean对象了
@Service("wechatPay")
public class WechatPayService implements PayService{

    /*
        这是一个支付方法，用于测试工厂模式
     */
    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }

}
