package com.jfk.finalkeyword;

/**
 * @author William Arustamyan
 */

public class Person extends Object {

    private String name;
    private String address;

    {
        System.out.println("Person INIT");
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("Person");
    }

    public Person() {
        System.out.println("DEFAULT PERSON");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
