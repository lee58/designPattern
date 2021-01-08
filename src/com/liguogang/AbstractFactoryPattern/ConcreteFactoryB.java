package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 具体工厂类B
* @Author:      LiGuoGang
* @date:    2021/1/8 20:58
*/
public class ConcreteFactoryB implements IFactory {
    @Override
    public IProductA makeProductA() {
        return new ConcreteProductAWithFactoryB();
    }

    @Override
    public IProductB makeProductB() {
        return new ConcreteProductBWithFactoryB();
    }
}
