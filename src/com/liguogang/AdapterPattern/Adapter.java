package com.liguogang.AdapterPattern;
/**
* @Description: 适配器 Adapter
* @Author:      LiGuoGang
* @date:    2021/2/9 21:07
*/
public class Adapter extends Adaptee implements ITarget{
    @Override
    public int targetMethod() {
        return super.output() + 1;
    }
}
