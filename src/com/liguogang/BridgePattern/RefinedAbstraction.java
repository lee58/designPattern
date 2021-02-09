package com.liguogang.BridgePattern;
/**
* @Description: 修正抽象 RefinedAbstraction
* @Author:      LiGuoGang
* @date:    2021/2/9 21:26
*/
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("RefinedAbstraction operation");
    }
}
