package com.liguogang.FactoryMethodPattern;
/**
* @Description: 具体产品
* @Author:      LiGuoGang
* @date:    2021/1/6 21:05
*/
public class ProductC implements IProduct {
    @Override
    public void productName() {
        System.out.println("product name C");
    }
}
