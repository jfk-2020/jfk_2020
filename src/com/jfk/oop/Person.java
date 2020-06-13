package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class Person {

    //mandatory fields
    private String name;
    private int age;

    //optional fields
    private Address address;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        address.setAddress("TADAM");
    }

    public Address getAddress() {
        return this.address;
    }
}
