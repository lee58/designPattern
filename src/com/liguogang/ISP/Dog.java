package com.liguogang.ISP;

public class Dog implements IEatAnimal, ISwimAnimal {
    @Override
    public void eat() {
        System.out.println("dog eat food");
    }

    @Override
    public void swim() {
        System.out.println("dog swim");
    }
}
