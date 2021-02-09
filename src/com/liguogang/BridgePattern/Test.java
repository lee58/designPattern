package com.liguogang.BridgePattern;


public class Test {
    public static void main(String[] args) {
        IImplementor concreteImplementorA = new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementorA);
        refinedAbstraction.operation();
    }
}
