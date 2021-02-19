package com.liguogang.DelegatePattern;

/**
 * @author 大都督
 * @create 2021/2/14
 */
public class ConcreteA implements ITask {
    @Override
    public void doTask() {
        System.out.println("ConcreteA doTask");
    }
}
