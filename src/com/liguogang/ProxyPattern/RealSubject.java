package com.liguogang.ProxyPattern;

/**
* @Description: 真实主题角色 RealSubject
* @Author:      LiGuoGang
* @date:    2021/1/23 10:30
*/
public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("具体请求");
    }
}
