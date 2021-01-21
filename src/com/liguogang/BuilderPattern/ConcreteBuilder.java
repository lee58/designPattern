package com.liguogang.BuilderPattern;
/**
* @Description: 具体建造者
* @Author:      LiGuoGang
* @date:    2021/1/21 21:09
*/
public class ConcreteBuilder implements IBuilder {

    private Product product = new Product();

    @Override
    public Product build() {
        return product;
    }
}
