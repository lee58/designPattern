package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 工厂B的具体产品A
* @Author:      LiGuoGang
* @date:    2021/1/8 20:49
*/
public class ConcreteProductAWithFactoryB implements IProductA {
    @Override
    public void doA() {
        System.out.println("工厂B, 生产, 产品A");
    }
}
