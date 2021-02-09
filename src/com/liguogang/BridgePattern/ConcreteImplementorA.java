package com.liguogang.BridgePattern;
/**
* @Description: 具体实现 ConcreteImplementorA
* @Author:      LiGuoGang
* @date:    2021/2/9 21:22
*/
public class ConcreteImplementorA implements IImplementor {
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorA  operation");
    }
}
