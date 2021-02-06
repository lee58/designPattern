package com.liguogang.CompositePattern;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();
}
