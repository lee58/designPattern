package com.liguogang.StrategyPattern;
/**
* @Description: 具体策略类
* @Author:      LiGuoGang
* @date:    2021/2/19 22:18
*/
public class ConcreteStrategy implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("ConcreteStrategy algorithm");
    }
}
