package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 具体工厂类A
* @Author:      LiGuoGang
* @date:    2021/1/8 20:58
*/
public class ConcreteFactoryA implements IFactory {
    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFactoryA();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFactoryA();
    }
}
