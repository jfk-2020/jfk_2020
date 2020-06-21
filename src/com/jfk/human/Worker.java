package com.jfk.human;

/**
 * @author William Arustamyan
 */

public class Worker extends Human {

    protected String profession;

    public Worker(String profession, String name, int age) {
        super(name, age);
        this.profession = profession;

    }

    public String getProfession() {
        return this.profession;
    }

    public String toString() {
        return "Worker : profession : " + this.profession + " : " + super.toString();
    }
}
