package com.liguogang.PrototypePattern;
/**
* @Description: 具体原型 ConcretePrototypeB
* @Author:      LiGuoGang
* @date:    2021/1/17 11:35
*/
public class ConcretePrototypeB implements IPrototype<ConcretePrototypeB> {
    private String desc;

    // 构造函数
    public ConcretePrototypeB(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this.desc);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
