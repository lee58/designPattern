package com.liguogang.AdapterPattern;

public class Test {
    public static void main(String[] args) {
        ITarget adapter = new Adapter();
        int i = adapter.targetMethod();
        System.out.println(i);
    }
}
