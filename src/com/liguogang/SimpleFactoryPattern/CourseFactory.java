package com.liguogang.SimpleFactoryPattern;

public class CourseFactory {

    public static ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz)
                return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
