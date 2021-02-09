package com.liguogang.BridgePattern;
/**
* @Description: 具体实现 ConcreteImplementorB
* @Author:      LiGuoGang
* @date:    2021/2/9 21:22
*/
public class ConcreteImplementorB implements IImplementor {
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorB  operation");
    }
}
