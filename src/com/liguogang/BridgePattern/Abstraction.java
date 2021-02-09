package com.liguogang.BridgePattern;
/**
* @Description: 抽象 Abstraction
* @Author:      LiGuoGang
* @date:    2021/2/9 21:24
*/
public abstract class Abstraction {
    protected IImplementor implementor;

    public Abstraction(IImplementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        this.implementor.operation();
    }
}
