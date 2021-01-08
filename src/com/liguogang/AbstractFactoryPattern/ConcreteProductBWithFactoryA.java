package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 工厂A的具体产品B
* @Author:      LiGuoGang
* @date:    2021/1/8 20:49
*/
public class ConcreteProductBWithFactoryA implements IProductB {

    @Override
    public void doB() {
        System.out.println("工厂A, 生产, 产品B");
    }
}
