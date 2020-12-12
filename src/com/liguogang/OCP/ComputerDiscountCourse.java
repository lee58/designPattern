package com.liguogang.OCP;

/**
 * 处理优惠逻辑的类——ComputerDiscountCourse类
 */
public class ComputerDiscountCourse extends ComputerCourse {

    public ComputerDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    public Double getPrice() {
        return super.getPrice() * 0.90;
    }

}
