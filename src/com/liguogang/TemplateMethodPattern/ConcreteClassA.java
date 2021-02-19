package com.liguogang.TemplateMethodPattern;

/**
 * @author 大都督
 * @create 2021/2/15
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassA step1");
    }
}
