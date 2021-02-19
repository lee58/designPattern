package com.liguogang.StrategyPattern;

public class Test {
    public static void main(String[] args) {
        IStrategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.algorithm();
    }
}
