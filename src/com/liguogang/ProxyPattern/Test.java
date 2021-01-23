package com.liguogang.ProxyPattern;
/**
* @Description: 测试代理类
* @Author:      LiGuoGang
* @date:    2021/1/23 10:36
*/
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
