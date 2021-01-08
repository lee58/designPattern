package com.liguogang.AbstractFactoryPattern;
/**
* @Description: 抽象工厂
* @Author:      LiGuoGang
* @date:    2021/1/8 20:44
*/
public interface IFactory {
    IProductA makeProductA();
    IProductB makeProductB();
}
