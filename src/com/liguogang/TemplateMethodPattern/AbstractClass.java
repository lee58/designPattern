package com.liguogang.TemplateMethodPattern;

/**
 * @author 大都督
 * @create 2021/2/15
 */
public abstract class AbstractClass {
    protected void step1() {
        System.out.println("AbstractClass step1");
    }
    protected void step2() {
        System.out.println("AbstractClass step2");
    }
    protected void step3() {
        System.out.println("AbstractClass step3");
    }

    /**
     * 声明为final类型的方法，避免子类对其复写
     */
    public final void templateMethod() {
        this.step1();
        this.step2();
        this.step3();
    }
}
