package com.liguogang.FactoryMethodPattern;
/**
* @Description: 生产ProductC产品的具体工厂类
* @Author:      LiGuoGang
* @date:    2021/1/6 21:07
*/
public class FactoryC implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ProductC();
    }
}
