package com.liguogang.FlyweightPattern;

public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        IFlyweight flyweightaa = flyweightFactory.getFlyweight("aa");
        flyweightaa.operation("a");

        IFlyweight flyweightbb = flyweightFactory.getFlyweight("bb");
        flyweightbb.operation("b");
    }
}
