package com.liguogang.FactoryMethodPattern;
/**
* @Description: 生产ProductA产品的具体工厂类
* @Author:      LiGuoGang
* @date:    2021/1/6 21:07
*/
public class FactoryA implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
