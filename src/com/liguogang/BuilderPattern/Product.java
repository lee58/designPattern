package com.liguogang.BuilderPattern;
/**
* @Description: 产品类
* @Author:      LiGuoGang
* @date:    2021/1/21 21:06
*/
public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
