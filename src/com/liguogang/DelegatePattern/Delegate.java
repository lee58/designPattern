package com.liguogang.DelegatePattern;

import java.util.Random;

/**
 * @author 大都督
 * @create 2021/2/14
 */
public class Delegate implements ITask {
    @Override
    public void doTask() {
        System.out.println("Delegate doTask");
        if (new Random().nextBoolean()) {
            new ConcreteA().doTask();
        } else {
            new ConcreteB().doTask();
        }
    }
}
