package com.liguogang.SingletonPattern;
/**
* @Description: 单例模式
* @Author:      LiGuoGang
* @date:    2021/1/9 18:52
*/
public class Singleton {
    private static  final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
