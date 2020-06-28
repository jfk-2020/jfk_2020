package com.jfk.abstractclass;

/**
 * @author William Arustamyan
 */

public abstract class AbstractEmployee extends Human {

    protected String address;


    public AbstractEmployee(String name, String address, int age) {
        super(name, age);
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

//
//    public String gender() {
//        return "unknown";
//    }

    public abstract String getProfession();
}
