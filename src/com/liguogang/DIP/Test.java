package com.liguogang.DIP;

public class Test {
    public static void main(String[] args) {
        // 依赖注入：构造器注入
//        Person person = new Person();
//        person.study(new EnglishCourse());

        // 依赖注入：Setter注入
        Person person = new Person();
        person.setCourse(new EnglishCourse());
        person.study();

        person.setCourse(new MathCourse());
        person.study();
    }
}
