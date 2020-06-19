package com.jfk.inheritance;

/**
 * @author William Arustamyan
 */

public class Accouter extends Employee {

    private String name;

    public Accouter(String accouterName, int age) {
        super(age);
        this.name = accouterName;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Accouter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
