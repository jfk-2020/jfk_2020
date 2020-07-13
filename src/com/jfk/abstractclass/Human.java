package com.jfk.abstractclass;

/**
 * @author William Arustamyan
 */

public abstract class Human {

    protected String name;
    protected int age;

    protected Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String gender();
}
