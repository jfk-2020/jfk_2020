package com.jfk.human;

/**
 * @author William Arustamyan
 */

public class Human {

    private String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Human : { name : " + this.name + ", age : " + this.age + " }";
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
