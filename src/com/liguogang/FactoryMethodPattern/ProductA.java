package com.liguogang.FactoryMethodPattern;
/**
* @Description: 具体产品
* @Author:      LiGuoGang
* @date:    2021/1/6 21:03
*/
public class ProductA implements IProduct {
    @Override
    public void productName() {
        System.out.println("product name A");
    }
}
