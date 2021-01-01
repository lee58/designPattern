package com.liguogang.DIP;


public class Person {
    /**
     * 依赖注入：构造器注入
     */
//    public void study(ICourse course) {
//        course.study();
//    }

    /**
     * 依赖注入：Setter注入
     */
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study(){
        course.study();
    }
}
