package com.liguogang.FactoryMethodPattern;

public class Test {
    public static void main(String[] args) {
        IProduct productA = new FactoryA().createProduct();
        productA.productName();

        IProduct productB = new FactoryB().createProduct();
        productB.productName();

        IProduct productC = new FactoryC().createProduct();
        productC.productName();
    }
}
