package com.bocao.designpattern.prototype.deep;

/**
 * 这是一个深克隆的地址类，用于测试原型模式
 */
public class Address implements Cloneable{
        String city;
        public Address(String city) {
            this.city = city;
        }

    /**
     * 创建并返回当前对象的一个副本
     *
     * @return 当前对象的一个副本
     * @throws CloneNotSupportedException 如果当前对象的类不支持 Cloneable 接口，则抛出 CloneNotSupportedException 异常
     */
    //    重写clone方法，实现浅深隆
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
       }
}
