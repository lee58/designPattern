package com.liguogang.FlyweightPattern;
/**
* @Description: 具体享元角色 ConcreteFlyweight
* @Author:      LiGuoGang
* @date:    2021/2/6 16:10
*/
public class ConcreteFlyweight implements IFlyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address:" + System.identityHashCode(this));
        System.out.println("IntrinsicState:" + this.intrinsicState);
        System.out.println("ExtrinsicState:" + extrinsicState);
    }
}
