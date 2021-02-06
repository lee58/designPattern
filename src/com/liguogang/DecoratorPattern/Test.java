package com.liguogang.DecoratorPattern;

public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.operation();

        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
        concreteDecoratorB.operation();
    }
}
