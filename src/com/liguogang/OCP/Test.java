package com.liguogang.OCP;

public class Test {
    public static void main(String[] args) {
        ComputerCourse computerCourse = new ComputerCourse(1, "计算机课程", 100.00);
        System.out.println("computerCourse原始价格 = " + computerCourse.getPrice());
        // 将程序中的ComputerCourse，替换为ComputerDiscountCourse后
        ComputerDiscountCourse computerDiscountCourse = new ComputerDiscountCourse(1, "计算机课程", 100.00);
        System.out.println("computerCourse原始价格 = " + computerDiscountCourse.getOriginPrice());
        System.out.println("computerCourse当前价格 = " + computerDiscountCourse.getPrice());
    }
}
