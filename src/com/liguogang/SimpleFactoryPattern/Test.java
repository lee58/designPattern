package com.liguogang.SimpleFactoryPattern;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCourse = courseFactory.create(JavaCourse.class);
        javaCourse.record();
    }
}
