package com.liguogang.PrototypePattern;
/**
* @Description: 具体原型 ConcretePrototypeA
* @Author:      LiGuoGang
* @date:    2021/1/17 11:35
*/
public class ConcretePrototypeA implements IPrototype<ConcretePrototypeA> {
    private String desc;

    // 构造函数
    public ConcretePrototypeA(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeA clone() {
        return new ConcretePrototypeA(this.desc);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
