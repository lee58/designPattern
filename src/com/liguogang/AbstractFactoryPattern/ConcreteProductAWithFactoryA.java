package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 工厂A的具体产品A
* @Author:      LiGuoGang
* @date:    2021/1/8 20:49
*/
public class ConcreteProductAWithFactoryA implements IProductA {
    @Override
    public void doA() {
        System.out.println("工厂A, 生产, 产品A");
    }
}
