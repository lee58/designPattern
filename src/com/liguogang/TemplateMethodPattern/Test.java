package com.liguogang.TemplateMethodPattern;

/**
 * @author 大都督
 * @create 2021/2/15
 */
public class Test {
    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();

        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassB.templateMethod();
    }
}
