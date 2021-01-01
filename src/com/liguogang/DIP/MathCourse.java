package com.liguogang.DIP;

public class MathCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学习数学课");
    }
}
