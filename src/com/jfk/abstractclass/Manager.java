package com.jfk.abstractclass;

/**
 * @author William Arustamyan
 */

public class Manager extends AbstractEmployee {
    public Manager(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    public String getProfession() {
        return "manager";
    }

    @Override
    public String gender() {
        return "female";
    }
}
