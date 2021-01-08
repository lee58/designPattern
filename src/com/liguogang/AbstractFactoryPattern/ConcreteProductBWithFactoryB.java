package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 工厂B的具体产品B
* @Author:      LiGuoGang
* @date:    2021/1/8 20:49
*/
public class ConcreteProductBWithFactoryB implements IProductB {

    @Override
    public void doB() {
        System.out.println("工厂B, 生产, 产品B");
    }
}
