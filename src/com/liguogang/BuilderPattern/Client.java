package com.liguogang.BuilderPattern;
/**
* @Description: 调用者
* @Author:      LiGuoGang
* @date:    2021/1/21 21:11
*/
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());
    }
}
