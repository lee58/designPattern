package com.liguogang.AbstractFactoryPattern;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new ConcreteFactoryA();
        factory.makeProductA().doA();
        factory.makeProductB().doB();

        factory = new ConcreteFactoryB();
        factory.makeProductA().doA();
        factory.makeProductB().doB();
    }
}
