package com.liguogang.StrategyPattern;
/**
* @Description: 上下文类
* @Author:      LiGuoGang
* @date:    2021/2/19 22:20
*/
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        this.strategy.algorithm();
    }
}
