package com.liguogang.PrototypePattern;
/**
* @Description: 客户类
* @Author:      LiGuoGang
* @date:    2021/1/17 11:39
*/
public class Client {
    public static void main(String[] args) {
        // 创建原型对象
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("originalA");
        System.out.println(prototypeA);
        // 复制原型对象
        ConcretePrototypeA cloneTypeA = prototypeA.clone();
        cloneTypeA.setDesc("clone");
        System.out.println(cloneTypeA);

        ConcretePrototypeB prototypeB = new ConcretePrototypeB("originalB");
        // 复制原型对象
        ConcretePrototypeB cloneTypeB = prototypeB.clone();
        System.out.println(cloneTypeB);
    }
}
